package de.samply.share.essentialquery;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;

public enum EssentialValueType {
  DATE {
    private final SimpleDateFormat dateFormatXml = new SimpleDateFormat("dd.MM.yyyy");
    private final SimpleDateFormat dateFormatCql = new SimpleDateFormat("@yyyy-MM-dd");

    /**
     * Get date as CQL date.
     * @param value the date
     * @return date in CQL format
     */
    public String asCqlString(String value) {
      if (StringUtils.isBlank(value)) {
        return "";
      }

      Date date = dateFormatXml.parse(value, new ParsePosition(0));
      if (date == null) {
        return StringUtils.EMPTY;
      }

      return dateFormatCql.format(date);
    }
  },
  DATETIME {
    private final SimpleDateFormat dateFormatXml = new SimpleDateFormat(
        "dd.MM.yyyy'T'HH:mm:ss");
    private final SimpleDateFormat dateFormatCql = new SimpleDateFormat(
        "@yyyy-MM-dd'T'HH:mm:ss");


    /**
     * Get datetime as CQL datetime.
     * @param value the datetime
     * @return datetime in CQL format
     */
    public String asCqlString(String value) {
      if (StringUtils.isBlank(value)) {
        return "";
      }

      Date date = dateFormatXml.parse(value, new ParsePosition(0));
      if (date == null) {
        return StringUtils.EMPTY;
      }

      return dateFormatCql.format(date);
    }
  },
  DECIMAL,
  INTEGER,
  STRING,
  PERMITTEDVALUE;

  public String asXmlString(String value) {
    return Objects.toString(value, StringUtils.EMPTY);
  }

  public String asCqlString(String value) {
    return Objects.toString(value, StringUtils.EMPTY);
  }
}
