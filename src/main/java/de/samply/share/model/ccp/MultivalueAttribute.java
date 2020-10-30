package de.samply.share.model.ccp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://schema.samply.de/ccp/MdrKey}MdrKey"/&gt;
 *         &lt;element ref="{http://schema.samply.de/ccp/Value}Value" maxOccurs="unbounded"/&gt;
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
@XmlRootElement(name = "MultivalueAttribute", namespace = "http://schema.samply.de/ccp/MultivalueAttribute")
public class MultivalueAttribute
    implements Serializable {

  private static final long serialVersionUID = 1L;
  @XmlElement(name = "MdrKey", namespace = "http://schema.samply.de/ccp/MdrKey", required = true)
  protected String mdrKey;
  @XmlElementRef(name = "Value", namespace = "http://schema.samply.de/ccp/Value", type = JAXBElement.class)
  protected List<JAXBElement<String>> value;

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
   * Gets the value of the value property.
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the value property.
   * For example, to add a new item, do as follows:
   * <pre>
   *    getValue().add(newItem);
   * </pre>
   * Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code <}{@link
   * String }{@code >} {@link JAXBElement }{@code <}{@link String }{@code >} {@link JAXBElement
   * }{@code <}{@link String }{@code >}
   */
  public List<JAXBElement<String>> getValue() {
    if (value == null) {
      value = new ArrayList<JAXBElement<String>>();
    }
    return this.value;
  }

}
