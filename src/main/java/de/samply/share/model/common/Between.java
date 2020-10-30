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
 *       &lt;all&gt;
 *         &lt;element ref="{http://schema.samply.de/common/RangeAttribute}RangeAttribute"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "Between")
public class Between implements Serializable {

  private static final long serialVersionUID = 1L;
  @XmlElement(name = "RangeAttribute", namespace = "http://schema.samply.de/common/RangeAttribute", required = true)
  protected RangeAttribute rangeAttribute;

  /**
   * Gets the value of the rangeAttribute property.
   *
   * @return possible object is {@link RangeAttribute }
   */
  public RangeAttribute getRangeAttribute() {
    return rangeAttribute;
  }

  /**
   * Sets the value of the rangeAttribute property.
   *
   * @param value allowed object is {@link RangeAttribute }
   */
  public void setRangeAttribute(RangeAttribute value) {
    this.rangeAttribute = value;
  }

}
