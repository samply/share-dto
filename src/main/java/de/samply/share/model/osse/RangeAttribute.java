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
 *         &lt;element ref="{http://schema.samply.de/osse/MdrKey}MdrKey"/&gt;
 *         &lt;element ref="{http://schema.samply.de/osse/Value}LowerBound"/&gt;
 *         &lt;element ref="{http://schema.samply.de/osse/Value}UpperBound"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "RangeAttribute", namespace = "http://schema.samply.de/osse/RangeAttribute")
public class RangeAttribute
    implements Serializable {

  private static final long serialVersionUID = 1L;
  @XmlElement(name = "MdrKey", namespace = "http://schema.samply.de/osse/MdrKey", required = true)
  protected String mdrKey;
  @XmlElement(name = "LowerBound", namespace = "http://schema.samply.de/osse/Value", required = true)
  protected String lowerBound;
  @XmlElement(name = "UpperBound", namespace = "http://schema.samply.de/osse/Value", required = true)
  protected String upperBound;

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
   * Gets the value of the lowerBound property.
   *
   * @return possible object is {@link String }
   */
  public String getLowerBound() {
    return lowerBound;
  }

  /**
   * Sets the value of the lowerBound property.
   *
   * @param value allowed object is {@link String }
   */
  public void setLowerBound(String value) {
    this.lowerBound = value;
  }

  /**
   * Gets the value of the upperBound property.
   *
   * @return possible object is {@link String }
   */
  public String getUpperBound() {
    return upperBound;
  }

  /**
   * Sets the value of the upperBound property.
   *
   * @param value allowed object is {@link String }
   */
  public void setUpperBound(String value) {
    this.upperBound = value;
  }

}
