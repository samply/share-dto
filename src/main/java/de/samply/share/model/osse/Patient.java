package de.samply.share.model.osse;

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
 * Java class for Patient complex type.
 * The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;complexType name="Patient"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.samply.de/osse/Entity}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://schema.samply.de/osse/Case}Case" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schema.samply.de/osse/Sample}Sample" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="dktk_id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="centraxx_id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Patient", namespace = "http://schema.samply.de/osse/Patient", propOrder = {
    "caseOsse",
    "sample"
})
@XmlRootElement(name = "Patient")
public class Patient
    extends Entity
    implements Serializable {

  private static final long serialVersionUID = 1L;
  @XmlElement(name = "Case", namespace = "http://schema.samply.de/osse/Case")
  protected List<Case> caseOsse;
  @XmlElement(name = "Sample", namespace = "http://schema.samply.de/osse/Sample")
  protected List<Sample> sample;
  @XmlAttribute(name = "dktk_id")
  protected String dktkId;
  @XmlAttribute(name = "centraxx_id")
  protected String centraxxId;

  /**
   * Gets the value of the case property.
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the case property.
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCase().add(newItem);
   * </pre>
   * Objects of the following type(s) are allowed in the list {@link Case }
   */
  public List<Case> getCase() {
    if (caseOsse == null) {
      caseOsse = new ArrayList<Case>();
    }
    return this.caseOsse;
  }

  /**
   * Gets the value of the sample property.
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the sample property.
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSample().add(newItem);
   * </pre>
   * Objects of the following type(s) are allowed in the list {@link Sample }
   */
  public List<Sample> getSample() {
    if (sample == null) {
      sample = new ArrayList<Sample>();
    }
    return this.sample;
  }

  /**
   * Gets the value of the dktkId property.
   *
   * @return possible object is {@link String }
   */
  public String getDktkId() {
    return dktkId;
  }

  /**
   * Sets the value of the dktkId property.
   *
   * @param value allowed object is {@link String }
   */
  public void setDktkId(String value) {
    this.dktkId = value;
  }

  /**
   * Gets the value of the centraxxId property.
   *
   * @return possible object is {@link String }
   */
  public String getCentraxxId() {
    return centraxxId;
  }

  /**
   * Sets the value of the centraxxId property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCentraxxId(String value) {
    this.centraxxId = value;
  }

}
