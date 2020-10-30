package de.samply.share.model.common;

import java.io.Serializable;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element ref="{http://schema.samply.de/common/MdrKey}MdrKey"/&gt;
 *         &lt;element ref="{http://schema.samply.de/common/Value}Value"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mdrKey",
    "value"
})
@XmlRootElement(name = "Attribute", namespace = "http://schema.samply.de/common/Attribute")
public class Attribute
    implements Serializable {

  private static final long serialVersionUID = 1L;
  @XmlElement(name = "MdrKey", namespace = "http://schema.samply.de/common/MdrKey", required = true)
  protected String mdrKey;
  @XmlElementRef(name = "Value", namespace = "http://schema.samply.de/common/Value", type = JAXBElement.class)
  protected JAXBElement<String> value;

  /**
   * Gets the value of the mdrKey property.
   *
   * @return possible object is {@link String }
   */
  public String getMdrKey() {
    return mdrKey;
  }

  /**
   * Sets the value of the mdrKey property.
   *
   * @param value allowed object is {@link String }
   */
  public void setMdrKey(String value) {
    this.mdrKey = value;
  }

  /**
   * Gets the value of the value property. @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >} {@link
   * JAXBElement }{@code <}{@link String }{@code >} {@link JAXBElement }{@code <}{@link String
   * }{@code >}
   */
  public JAXBElement<String> getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   *
   * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >} {@link
   *              JAXBElement }{@code <}{@link String }{@code >} {@link JAXBElement }{@code <}{@link
   *              String }{@code >}
   */
  public void setValue(JAXBElement<String> value) {
    this.value = value;
  }

}
