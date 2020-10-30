package de.samply.share.model.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element ref="{http://schema.samply.de/common/MdrKey}MdrKey" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{http://schema.samply.de/common/Error}ErrorAttachment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="errorCode" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "mdrKey",
    "extension"
})
@XmlRootElement(name = "Error", namespace = "http://schema.samply.de/common/Error")
public class Error
    implements Serializable {

  private static final long serialVersionUID = 1L;
  @XmlElement(name = "Description", namespace = "http://schema.samply.de/common/Error", required = true)
  protected Object description;
  @XmlElement(name = "MdrKey", namespace = "http://schema.samply.de/common/MdrKey")
  protected List<String> mdrKey;
  @XmlElement(namespace = "http://schema.samply.de/common/Error")
  protected ErrorAttachment extension;
  @XmlAttribute(name = "errorCode", required = true)
  protected int errorCode;

  /**
   * Gets the value of the description property.
   *
   * @return possible object is {@link Object }
   */
  public Object getDescription() {
    return description;
  }

  /**
   * Sets the value of the description property.
   *
   * @param value allowed object is {@link Object }
   */
  public void setDescription(Object value) {
    this.description = value;
  }

  /**
   * Gets the value of the mdrKey property.
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the mdrKey property.
   * For example, to add a new item, do as follows:
   * <pre>
   *    getMdrKey().add(newItem);
   * </pre>
   * Objects of the following type(s) are allowed in the list {@link String }
   */
  public List<String> getMdrKey() {
    if (mdrKey == null) {
      mdrKey = new ArrayList<String>();
    }
    return this.mdrKey;
  }

  /**
   * Gets the value of the extension property.
   *
   * @return possible object is {@link ErrorAttachment }
   */
  public ErrorAttachment getExtension() {
    return extension;
  }

  /**
   * Sets the value of the extension property.
   *
   * @param value allowed object is {@link ErrorAttachment }
   */
  public void setExtension(ErrorAttachment value) {
    this.extension = value;
  }

  /**
   * Gets the value of the errorCode property.
   */
  public int getErrorCode() {
    return errorCode;
  }

  /**
   * Sets the value of the errorCode property.
   */
  public void setErrorCode(int value) {
    this.errorCode = value;
  }

}
