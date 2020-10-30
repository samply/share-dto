package de.samply.share.model.ccp;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Java class for Container complex type.
 * The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="Container"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.samply.de/ccp/Entity}Entity"&gt;
 *       &lt;attribute name="designation" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Container", namespace = "http://schema.samply.de/ccp/Container")
@XmlRootElement(name = "Container")
public class Container
    extends Entity
    implements Serializable {

  private static final long serialVersionUID = 1L;
  @XmlAttribute(name = "designation", required = true)
  protected String designation;

  /**
   * Gets the value of the designation property.
   *
   * @return possible object is {@link String }
   */
  public String getDesignation() {
    return designation;
  }

  /**
   * Sets the value of the designation property.
   *
   * @param value allowed object is {@link String }
   */
  public void setDesignation(String value) {
    this.designation = value;
  }

}
