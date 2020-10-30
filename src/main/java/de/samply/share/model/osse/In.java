package de.samply.share.model.osse;

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
 *         &lt;element ref="{http://schema.samply.de/osse/MultivalueAttribute}MultivalueAttribute"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "In")
public class In implements Serializable {

  private static final long serialVersionUID = 1L;
  @XmlElement(name = "MultivalueAttribute", namespace = "http://schema.samply.de/osse/MultivalueAttribute", required = true)
  protected MultivalueAttribute multivalueAttribute;

  /**
   * Gets the value of the multivalueAttribute property.
   *
   * @return possible object is {@link MultivalueAttribute }
   */
  public MultivalueAttribute getMultivalueAttribute() {
    return multivalueAttribute;
  }

  /**
   * Sets the value of the multivalueAttribute property.
   *
   * @param value allowed object is {@link MultivalueAttribute }
   */
  public void setMultivalueAttribute(MultivalueAttribute value) {
    this.multivalueAttribute = value;
  }

}
