package de.samply.share.model.ccp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Java class for Entity complex type.
 * The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="Entity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://schema.samply.de/ccp/Attribute}Attribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schema.samply.de/ccp/Container}Container" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Ref" type="{http://schema.samply.de/ccp/Entity}Ref" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entity", namespace = "http://schema.samply.de/ccp/Entity", propOrder = {
    "attribute",
    "container",
    "ref"
})
@XmlSeeAlso({
    Patient.class,
    Container.class,
    Sample.class,
    Case.class
})
public class Entity
    implements Serializable {

  private static final long serialVersionUID = 1L;
  @XmlElement(name = "Attribute", namespace = "http://schema.samply.de/ccp/Attribute")
  protected List<Attribute> attribute;
  @XmlElement(name = "Container", namespace = "http://schema.samply.de/ccp/Container")
  protected List<Container> container;
  @XmlElement(name = "Ref", namespace = "")
  protected List<Ref> ref;
  @XmlAttribute(name = "id", required = true)
  protected String id;

  /**
   * Gets the value of the attribute property.
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the attribute property.
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAttribute().add(newItem);
   * </pre>
   * Objects of the following type(s) are allowed in the list {@link Attribute }
   */
  public List<Attribute> getAttribute() {
    if (attribute == null) {
      attribute = new ArrayList<Attribute>();
    }
    return this.attribute;
  }

  /**
   * Gets the value of the container property.
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the container property.
   * For example, to add a new item, do as follows:
   * <pre>
   *    getContainer().add(newItem);
   * </pre>
   * Objects of the following type(s) are allowed in the list {@link Container }
   */
  public List<Container> getContainer() {
    if (container == null) {
      container = new ArrayList<Container>();
    }
    return this.container;
  }

  /**
   * Gets the value of the ref property.
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the ref property.
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRef().add(newItem);
   * </pre>
   * Objects of the following type(s) are allowed in the list {@link Ref }
   */
  public List<Ref> getRef() {
    if (ref == null) {
      ref = new ArrayList<Ref>();
    }
    return this.ref;
  }

  /**
   * Gets the value of the id property.
   * @return possible object is {@link String }
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the value of the id property.
   * @param value allowed object is {@link String }
   */
  public void setId(String value) {
    this.id = value;
  }

}
