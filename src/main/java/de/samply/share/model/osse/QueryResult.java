package de.samply.share.model.osse;

import de.samply.share.model.common.Result;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Java class for QueryResult complex type.
 * The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="QueryResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://schema.samply.de/osse/Entity}Entity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResult", namespace = "http://schema.samply.de/osse/QueryResult", propOrder = {
    "entity"
})
public class QueryResult implements Result, Serializable {

  private static final long serialVersionUID = 1L;
  @XmlElement(name = "Entity", namespace = "http://schema.samply.de/osse/Entity")
  protected List<Entity> entity;
  @XmlAttribute(name = "id")
  protected String id;

  /**
   * Gets the value of the entity property.
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the entity property.
  * For example, to add a new item, do as follows:
   * <pre>
   *    getEntity().add(newItem);
   * </pre>
   * Objects of the following type(s) are allowed in the list {@link Entity }
   */
  public List<Entity> getEntity() {
    if (entity == null) {
      entity = new ArrayList<>();
    }
    return this.entity;
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
