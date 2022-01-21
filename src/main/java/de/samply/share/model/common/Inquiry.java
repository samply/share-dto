package de.samply.share.model.common;

import de.samply.share.model.cql.CqlQueryList;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Java class for Inquiry complex type.
 * The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="Inquiry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://schema.samply.de/common/Query}Query"/&gt;
 *         &lt;element ref="{http://schema.samply.de/cql/cqlQueryList}CqlQueryList"/&gt;
 *         &lt;element name="ExposeURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Author" type="{http://schema.samply.de/common/Inquiry}contact"/&gt;
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SearchFor" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="revision" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Inquiry", namespace = "http://schema.samply.de/common/Inquiry", propOrder = {
    "query",
    "cqlQueryList",
    "structuredQuery",
    "exposeUrl",
    "author",
    "label",
    "description",
    "searchFor"
})
@XmlRootElement
public class Inquiry
    implements Serializable {

  private static final long serialVersionUID = 1L;

  @XmlElement(name = "Query", namespace = "http://schema.samply.de/common/Query")
  protected Query query;

  @XmlElement(name = "cqlQueryList", namespace = "http://schema.samply.de/cql/CqlQueryList")
  protected CqlQueryList cqlQueryList;

  @XmlElement(name = "StructuredQuery")
  protected String structuredQuery;

  @XmlElement(name = "ExposeURL", required = true)
  protected String exposeUrl;

  @XmlElement(name = "Author", required = true)
  protected Contact author;

  @XmlElement(name = "Label", required = true)
  protected String label;

  @XmlElement(name = "Description", required = true)
  protected String description;

  @XmlElement(name = "SearchFor")
  protected List<String> searchFor;

  @XmlAttribute(name = "id", required = true)
  protected String id;

  @XmlAttribute(name = "revision", required = true)
  protected String revision;

  /**
   * Gets the value of the query property.
   *
   * @return possible object is {@link Query }
   */
  public Query getQuery() {
    return query;
  }

  /**
   * Sets the value of the query property.
   *
   * @param value allowed object is {@link Query }
   */
  public void setQuery(Query value) {
    this.query = value;
  }

  public CqlQueryList getCqlQueryList() {
    return cqlQueryList;
  }

  public void setCqlQueryList(CqlQueryList cqlQueryList) {
    this.cqlQueryList = cqlQueryList;
  }

  /**
   * Gets the value of the structuredQuery property.
   *
   * @return possible object is {@link String }
   */
  public String getStructuredQuery() {
    return structuredQuery;
  }

  /**
   * Sets the value of the structuredQuery property.
   *
   * @param structuredQuery allowed object is {@link String }
   */
  public void setStructuredQuery(String structuredQuery) {
    this.structuredQuery = structuredQuery;
  }

  /**
   * Gets the value of the exposeURL property.
   *
   * @return possible object is {@link String }
   */
  public String getExposeUrl() {
    return exposeUrl;
  }

  /**
   * Sets the value of the exposeURL property.
   *
   * @param value allowed object is {@link String }
   */
  public void setExposeUrl(String value) {
    this.exposeUrl = value;
  }

  /**
   * Gets the value of the author property.
   *
   * @return possible object is {@link Contact }
   */
  public Contact getAuthor() {
    return author;
  }

  /**
   * Sets the value of the author property.
   *
   * @param value allowed object is {@link Contact }
   */
  public void setAuthor(Contact value) {
    this.author = value;
  }

  /**
   * Gets the value of the label property.
   *
   * @return possible object is {@link String }
   */
  public String getLabel() {
    return label;
  }

  /**
   * Sets the value of the label property.
   *
   * @param value allowed object is {@link String }
   */
  public void setLabel(String value) {
    this.label = value;
  }

  /**
   * Gets the value of the description property.
   *
   * @return possible object is {@link String }
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the value of the description property.
   *
   * @param value allowed object is {@link String }
   */
  public void setDescription(String value) {
    this.description = value;
  }

  /**
   * Gets the value of the searchFor property.
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the searchFor property.
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSearchFor().add(newItem);
   * </pre>
   * Objects of the following type(s) are allowed in the list {@link String }
   */
  public List<String> getSearchFor() {
    if (searchFor == null) {
      searchFor = new ArrayList<>();
    }
    return this.searchFor;
  }

  /**
   * Gets the value of the id property.
   *
   * @return possible object is {@link String }
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the value of the id property.
   *
   * @param value allowed object is {@link String }
   */
  public void setId(String value) {
    this.id = value;
  }

  /**
   * Gets the value of the revision property.
   *
   * @return possible object is {@link String }
   */
  public String getRevision() {
    return revision;
  }

  /**
   * Sets the value of the revision property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRevision(String value) {
    this.revision = value;
  }

}
