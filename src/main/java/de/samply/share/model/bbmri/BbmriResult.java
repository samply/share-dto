package de.samply.share.model.bbmri;

import de.samply.share.model.common.ISamplyResult;
import de.samply.share.model.osse.Patient;
import java.io.Serializable;
import java.util.List;
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
 *       &lt;sequence&gt;
 *         &lt;element name="queryId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="directoryCollectionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numberOfSamples" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numberOfDonors" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="negotiatorQueryId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "queryId",
    "directoryCollectionId",
    "numberOfSpecimens",
    "numberOfPatients",
    "negotiatorQueryId",
    "donors"
})
@XmlRootElement(name = "bbmriResult")
public class BbmriResult implements ISamplyResult, Serializable {

  private static final long serialVersionUID = 1L;
  protected int queryId;
  @XmlElement(required = true)
  protected String directoryCollectionId;
  @XmlElement(name = "numberOfSamples")
  protected int numberOfSpecimens;
  @XmlElement(name = "numberOfDonors")
  protected int numberOfPatients;
  protected int negotiatorQueryId;
  protected List<Patient> donors;

  public List<Patient> getDonors() {
    return donors;
  }

  public void setDonors(List<Patient> donors) {
    this.donors = donors;
  }

  /**
   * Gets the value of the queryId property.
   */
  public int getQueryId() {
    return queryId;
  }

  /**
   * Sets the value of the queryId property.
   */
  public void setQueryId(int value) {
    this.queryId = value;
  }

  /**
   * Gets the value of the directoryCollectionId property.
   *
   * @return possible object is {@link String }
   */
  public String getDirectoryCollectionId() {
    return directoryCollectionId;
  }

  /**
   * Sets the value of the directoryCollectionId property.
   *
   * @param value allowed object is {@link String }
   */
  public void setDirectoryCollectionId(String value) {
    this.directoryCollectionId = value;
  }

  /**
   * Gets the value of the numberOfSpecimens property.
   */
  public int getNumberOfSpecimens() {
    return numberOfSpecimens;
  }

  /**
   * Sets the value of the numberOfSpecimens property.
   */
  public void setNumberOfSpecimens(int value) {
    this.numberOfSpecimens = value;
  }

  /**
   * Gets the value of the numberOfPatients property.
   */
  public int getNumberOfPatients() {
    return numberOfPatients;
  }

  /**
   * Sets the value of the numberOfPatients property.
   */
  public void setNumberOfPatients(int value) {
    this.numberOfPatients = value;
  }

  /**
   * Gets the value of the negotiatorQueryId property.
   */
  public int getNegotiatorQueryId() {
    return negotiatorQueryId;
  }

  /**
   * Sets the value of the negotiatorQueryId property.
   */
  public void setNegotiatorQueryId(int value) {
    this.negotiatorQueryId = value;
  }

}
