package de.samply.share.model.ccp;

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
 *       &lt;all&gt;
 *         &lt;element ref="{http://schema.samply.de/ccp/Attribute}Attribute"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "Like")
public class Like implements Serializable {

  private static final long serialVersionUID = 1L;
  @XmlElement(name = "Attribute", namespace = "http://schema.samply.de/ccp/Attribute", required = true)
  protected Attribute attribute;

  /**
   * Gets the value of the attribute property.
   *
   * @return possible object is {@link Attribute }
   */
  public Attribute getAttribute() {
    return attribute;
  }

  /**
   * Sets the value of the attribute property.
   *
   * @param value allowed object is {@link Attribute }
   */
  public void setAttribute(Attribute value) {
    this.attribute = value;
  }

}
