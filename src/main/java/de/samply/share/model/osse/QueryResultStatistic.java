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
 *       &lt;sequence&gt;
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numberOfPages" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="totalSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestId",
    "numberOfPages",
    "totalSize"
})
@XmlRootElement(name = "queryResultStatistic", namespace = "http://schema.samply.de/osse/QueryResultStatistic")
public class QueryResultStatistic
    implements Serializable {

  private static final long serialVersionUID = 1L;
  @XmlElement(namespace = "", required = true)
  protected String requestId;
  @XmlElement(namespace = "")
  protected int numberOfPages;
  @XmlElement(namespace = "")
  protected int totalSize;

  /**
   * Gets the value of the requestId property.
   *
   * @return possible object is {@link String }
   */
  public String getRequestId() {
    return requestId;
  }

  /**
   * Sets the value of the requestId property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRequestId(String value) {
    this.requestId = value;
  }

  /**
   * Gets the value of the numberOfPages property.
   */
  public int getNumberOfPages() {
    return numberOfPages;
  }

  /**
   * Sets the value of the numberOfPages property.
   */
  public void setNumberOfPages(int value) {
    this.numberOfPages = value;
  }

  /**
   * Gets the value of the totalSize property.
   */
  public int getTotalSize() {
    return totalSize;
  }

  /**
   * Sets the value of the totalSize property.
   */
  public void setTotalSize(int value) {
    this.totalSize = value;
  }

}
