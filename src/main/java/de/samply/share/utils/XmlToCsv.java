package de.samply.share.utils;

import de.samply.share.model.osse.Attribute;
import de.samply.share.model.osse.Case;
import de.samply.share.model.osse.Container;
import de.samply.share.model.osse.Entity;
import de.samply.share.model.osse.Patient;
import de.samply.share.model.osse.QueryResult;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


/**
 * This class converts a QueryResult into a CSV, with attached mappings.
 */
public class XmlToCsv {

  /**
   * Joins the collection of strings into one string using the specified delimiter.
   *
   * @param s the strings
   * @param delimiter the delimiter
   * @return the joined strings
   */
  private static String join(Collection<String> s, String delimiter) {
    if (s.isEmpty()) {
      return "";
    }
    Iterator<String> iter = s.iterator();
    StringBuilder buffer = new StringBuilder("\"").append(iter.next().replace("\"", "\"\""))
        .append("\"");
    while (iter.hasNext()) {
      buffer.append(delimiter).append("\"").append(iter.next().replace("\"", "\"\"")).append("\"");
    }
    return buffer.toString();
  }

  /**
   * Converts a QueryResult into a csv file and a mapping file.
   *
   * @param result        the query result that shall be converted
   * @param csvWriter     where the data itself will be written to
   * @param mappingWriter where the mapping between csv columns and mdr keys will be written to
   * @throws IOException ioException
   */
  public void convert(QueryResult result, Writer csvWriter, Writer mappingWriter)
      throws IOException {
    List<Line> lines = new ArrayList<>();

    /**
     * For every episode there should be one line of CSV.
     * Parse every patient and every case.
     * Each case has 0 to n CaseForms, which are combined into one line of CSV.
     * Each case may have 0 to n Episode, which again may have 0 to n EpisodeForms.
     *
     * Those EpisodeForms are combined into one line of CSV (= y).
     *
     * So in the end every line of the resulting CSV consists of two parts:
     * The combined values of the CaseForms and the combined values of the EpisodeForms.
     */

    for (Entity entPatient : result.getEntity()) {
      Patient patient = (Patient) entPatient;

      for (Case caseOsse : patient.getCase()) {
        Properties caseFormProperties = new Properties(caseOsse.getId());

        /**
         * Go through all Case Forms and put the values into
         * the caseFormProperties
         */
        for (Container container : caseOsse.getContainer()) {
          if (container.getDesignation().startsWith("CaseForm:")) {
            for (Attribute attr : container.getAttribute()) {
              caseFormProperties.addProperty(attr.getMdrKey(), attr.getValue().getValue());
            }

            for (Container record : container.getContainer()) {
              if (record.getDesignation().equals("Record")) {
                Properties recordProperties = new Properties(record.getId());
                for (Attribute attr : record.getAttribute()) {
                  recordProperties.addProperty(attr.getMdrKey(), attr.getValue().getValue());
                }
                caseFormProperties.addRecord(recordProperties);
              }
            }
          }
        }

        /**
         * Go through all Episodes. For each episode there should be one line of CSV.
         * If there are no Episodes, still add one line for the Case itself.
         */
        int episodeFormCount = 0;
        for (Container container : caseOsse.getContainer()) {
          if (container.getDesignation().startsWith("Episode")) {
            episodeFormCount++;
            String date = "";

            for (Attribute attr : container.getAttribute()) {
              if (attr.getMdrKey().equals("episode-date")) {
                date = attr.getValue().getValue();
              }
            }

            Properties episodeFormProperties = new Properties(date);

            /**
             * Go through all EpisodeForms and combine the values into
             * the episodeFormProperties.
             */
            for (Container epiFormContainer : container.getContainer()) {
              for (Attribute attr : epiFormContainer.getAttribute()) {
                episodeFormProperties.addProperty(attr.getMdrKey(), attr.getValue().getValue());
              }

              for (Container record : epiFormContainer.getContainer()) {
                if (record.getDesignation().equals("Record")) {
                  Properties recordProperties = new Properties(record.getId());
                  for (Attribute attr : record.getAttribute()) {
                    recordProperties.addProperty(attr.getMdrKey(), attr.getValue().getValue());
                  }
                  episodeFormProperties.addRecord(recordProperties);
                }
              }
            }

            /**
             * Now we are ready. Add the line to the array.
             */
            lines.add(new Line(patient.getId(), caseFormProperties, episodeFormProperties));
          }
        }
        if (caseOsse.getContainer().size() > 0 && episodeFormCount < 1) {
          lines.add(new Line(patient.getId(), caseFormProperties, new Properties("")));
        }
      }
    }

    FormContainer caseContainer = new FormContainer();
    FormContainer epiContainer = new FormContainer();

    for (Line line : lines) {
      caseContainer.addForm(line.caseForm);
      epiContainer.addForm(line.epiForm);
    }

    /**
     * This contains all maps and indices.
     */
    AttributeIndex index = new AttributeIndex();

    caseContainer.finalize(index);
    index.map.put("epi-date", "episode-date");
    index.header.add("epi-date");
    epiContainer.finalize(index);

    /**
     * Create the header line. If the max length of the value is greater than one,
     * it means that it is a list attribute.
     */

    csvWriter.append(join(index.header, ";") + "\r\n");

    for (Line line : lines) {
      List<String> values = new ArrayList<>();

      values.add("" + line.patientId);

      /**
       * Go through all keys and add the values to the list.
       */

      values.addAll(caseContainer.getValues(line.caseForm));

      if (line.epiForm != null) {
        values.add(line.epiForm.getId());
      }

      values.addAll(epiContainer.getValues(line.epiForm));

      /**
       * Write this line.
       */
      csvWriter.append(join(values, ";") + "\r\n");
    }

    for (String key : index.map.keySet()) {
      mappingWriter.append(key + ";" + index.map.get(key) + "\r\n");
    }
  }

  private static class Line {

    private final String patientId;

    private final Properties caseForm;

    private final Properties epiForm;

    public Line(String patientId, Properties caseForm, Properties epiForm) {
      this.patientId = patientId;
      this.caseForm = caseForm;
      this.epiForm = epiForm;
    }
  }

  private static class AttributeIndex {

    private HashMap<String, String> map = new HashMap<>();

    private int attrId = 1;
    private int listAttrId = 1;
    private int recordAttrId = 1;

    private List<String> header = new ArrayList<String>();

    public AttributeIndex() {
      header.add("pid");
    }
  }

  private static class FormContainer {

    private HashMap<String, Integer> maxLength = new HashMap<>();
    private HashMap<String, Integer> maxRecordLength = new HashMap<>();
    private HashMap<String, Integer> recordSize = new HashMap<>();

    private HashMap<String, List<String>> recordOrder = new HashMap<>();

    private List<String> keys;
    private List<String> recordKeys;

    /**
     * Todo.
     * @param form the form
     */
    public void addForm(Properties form) {
      if (form == null) {
        return;
      }

      for (String key : form.getKeys()) {
        if (maxLength.containsKey(key)) {
          maxLength.put(key, Math.max(form.getSize(key), maxLength.get(key)));
        } else {
          maxLength.put(key, form.getSize(key));
        }
      }

      for (String key : form.getRecords()) {
        recordSize.put(key, form.getRecords(key).get(0).getKeys().size());
        recordOrder.put(key, new ArrayList<String>(form.getRecords(key).get(0).getKeys()));
        if (maxRecordLength.containsKey(key)) {
          maxRecordLength.put(key, Math.max(form.getRecordSize(key), maxRecordLength.get(key)));
        } else {
          maxRecordLength.put(key, form.getRecordSize(key));
        }
      }
    }

    /**
     * Get the values of a form.
     * @return Values as Collection
     */
    public Collection<? extends String> getValues(Properties form) {
      List<String> values = new ArrayList<>();

      for (String prop : keys) {
        if (form.get(prop) == null) {
          for (int i = 0; i < maxLength.get(prop); ++i) {
            values.add("");
          }
        } else {
          values.addAll(form.get(prop));

          /**
           * Make sure to add enough empty values.
           */
          int added = form.getSize(prop);
          while (added++ < maxLength.get(prop)) {
            values.add("");
          }
        }
      }

      for (String prop : recordKeys) {
        if (form.getRecords(prop) == null) {
          for (int i = 0; i < maxRecordLength.get(prop); ++i) {
            for (int u = 0; u < recordOrder.get(prop).size(); ++u) {
              values.add("");
            }
          }
        } else {

          for (Properties p : form.getRecords(prop)) {
            for (String k : recordOrder.get(prop)) {
              values.addAll(p.get(k));
            }
          }

          /**
           * Make sure to add enough empty values.
           */
          int added = form.getRecordSize(prop);
          while (added++ < maxRecordLength.get(prop)) {
            for (int i = 0; i < recordOrder.get(prop).size(); ++i) {
              values.add("");
            }
          }
        }
      }
      return values;
    }

    /** ToDo.
     * @param index index
     */
    public void finalize(AttributeIndex index) {
      keys = new ArrayList<String>(maxLength.keySet());
      recordKeys = new ArrayList<String>(maxRecordLength.keySet());

      for (String key : keys) {
        if (maxLength.get(key) > 1) {
          for (int i = 1; i <= maxLength.get(key); ++i) {
            String label = "la" + index.listAttrId + "_v" + i;
            index.header.add(label);
          }
          index.map.put("la" + index.listAttrId, key);
          index.listAttrId++;
        } else {
          String label = "a" + (index.attrId++);
          index.map.put(label, key);
          index.header.add(label);
        }
      }

      for (String key : recordKeys) {
        for (int i = 1; i <= maxRecordLength.get(key); ++i) {
          String label = "rec" + index.recordAttrId;

          int u = 1;
          for (String deKey : recordOrder.get(key)) {
            index.header.add(label + "_de" + u + "_v" + i);
            index.map.put(label + "_de" + u, key + " " + deKey);

            u++;
          }
        }

        index.recordAttrId++;
      }
    }
  }

  /**
   * This class merges other instances of properties together.
   */
  private static class Properties {

    private HashMap<String, List<String>> values = new HashMap<>();

    private HashMap<String, List<Properties>> recordValues = new HashMap<>();

    private String id;

    public Properties(String id, Properties... forms) {
      this.id = id;
      for (Properties props : forms) {
        for (String p : props.values.keySet()) {
          for (String value : props.values.get(p)) {
            addProperty(p, value);
          }
        }
      }
    }

    /** Todo.
     * @param recordProperties todo
     */
    public void addRecord(Properties recordProperties) {
      if (!recordValues.containsKey(recordProperties.getId())) {
        recordValues.put(recordProperties.getId(), new ArrayList<Properties>());
      }

      recordValues.get(recordProperties.getId()).add(recordProperties);
    }

    public void addProperty(String urn, String value) {
      if (!values.containsKey(urn)) {
        values.put(urn, new ArrayList<String>());
      }

      values.get(urn).add(value);
    }

    public List<Properties> getRecords(String key) {
      return recordValues.get(key);
    }

    public Set<String> getRecords() {
      return recordValues.keySet();
    }

    public Set<String> getKeys() {
      return values.keySet();
    }

    public int getSize(String key) {
      return values.get(key).size();
    }

    public int getRecordSize(String key) {
      return recordValues.get(key).size();
    }

    public List<String> get(String key) {
      return values.get(key);
    }

    public String getId() {
      return id;
    }
  }

}
