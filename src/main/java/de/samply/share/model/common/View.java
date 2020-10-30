package de.samply.share.model.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Java class for anonymous complex type.
 * The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://schema.samply.de/common/Query}Query"/&gt;
 *         &lt;element ref="{http://schema.samply.de/common/Query}ViewFields" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "query",
    "viewFields"
})
@XmlRootElement(name = "View")
public class View
    implements Serializable {

  private static final long serialVersionUID = 1L;
  @XmlElement(name = "Query", required = true)
  protected Query query;
  @XmlElement(name = "ViewFields")
  protected ViewFields viewFields;

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

  /**
   * Gets the value of the viewFields property.
   *
   * @return possible object is {@link ViewFields }
   */
  public ViewFields getViewFields() {
    return viewFields;
  }

  /**
   * Sets the value of the viewFields property.
   *
   * @param value allowed object is {@link ViewFields }
   */
  public void setViewFields(ViewFields value) {
    this.viewFields = value;
  }

}
