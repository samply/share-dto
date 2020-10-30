package de.samply.share.model.ccp;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;all&gt;
 *         &lt;element ref="{http://schema.samply.de/ccp/Query}Where"/&gt;
 *         &lt;element ref="{http://schema.samply.de/ccp/Query}OrderBy" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schema.samply.de/ccp/Query}GroupBy" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "Query")
public class Query
    implements Serializable {

  private static final long serialVersionUID = 1L;
  @XmlElement(name = "Where", required = true)
  protected Where where;
  @XmlElement(name = "OrderBy")
  protected OrderBy orderBy;
  @XmlElement(name = "GroupBy")
  protected GroupBy groupBy;
  @XmlAttribute(name = "id")
  protected String id;

  /**
   * Gets the value of the where property.
   *
   * @return possible object is {@link Where }
   */
  public Where getWhere() {
    return where;
  }

  /**
   * Sets the value of the where property.
   *
   * @param value allowed object is {@link Where }
   */
  public void setWhere(Where value) {
    this.where = value;
  }

  /**
   * Gets the value of the orderBy property.
   *
   * @return possible object is {@link OrderBy }
   */
  public OrderBy getOrderBy() {
    return orderBy;
  }

  /**
   * Sets the value of the orderBy property.
   *
   * @param value allowed object is {@link OrderBy }
   */
  public void setOrderBy(OrderBy value) {
    this.orderBy = value;
  }

  /**
   * Gets the value of the groupBy property.
   *
   * @return possible object is {@link GroupBy }
   */
  public GroupBy getGroupBy() {
    return groupBy;
  }

  /**
   * Sets the value of the groupBy property.
   *
   * @param value allowed object is {@link GroupBy }
   */
  public void setGroupBy(GroupBy value) {
    this.groupBy = value;
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

}
