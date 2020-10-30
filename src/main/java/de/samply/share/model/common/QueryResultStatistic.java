package de.samply.share.model.common;

import de.samply.share.model.common.result.Stratification;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestId",
    "numberOfPages",
    "totalSize",
    "stratification"
})
@XmlRootElement(name = "queryResultStatistic", namespace = "http://schema.samply.de/common/QueryResultStatistic")
public class QueryResultStatistic
    implements Serializable {

  private static final long serialVersionUID = 1L;
  @XmlElement(namespace = "", required = true)
  private String requestId;
  @XmlElement(namespace = "")
  private int numberOfPages;
  @XmlElement(namespace = "")
  private int totalSize;

  private List<Stratification> stratification = new ArrayList<>();

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

  public List<Stratification> getStratification() {
    return stratification;
  }

  public void setStratification(List<Stratification> stratification) {
    this.stratification = stratification;
  }
}
