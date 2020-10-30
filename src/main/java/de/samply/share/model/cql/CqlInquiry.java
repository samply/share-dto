package de.samply.share.model.cql;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Java class for CQL inquiry.
 * The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;cqlInquiry&gt;
 * &lt;inquiryId&gt;&lt;/inquiryId&gt;
 *   &lt;queries&gt;
 *     &lt;query&gt;
 *       &lt;entityType&gt;&lt;/entityType&gt;
 *       &lt;cql&gt;&lt;/cql&gt;
 *     &lt;/query&gt;
 *     &lt;query&gt;
 *       &lt;entityType&gt;&lt;/entityType&gt;
 *       &lt;cql&gt;&lt;/cql&gt;
 *     &lt;/query&gt;
 *   &lt;/queries&gt;
 * &lt;/cqlInquiry&gt;
 * </pre>
 */
@SuppressWarnings("WeakerAccess")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class CqlInquiry implements Serializable {

  private static final long serialVersionUID = 1L;

  private int inquiryId;

  @XmlElement(name = "queries")
  private CqlQueryList queries = new CqlQueryList();

  public int getInquiryId() {
    return inquiryId;
  }

  public void setInquiryId(int inquiryId) {
    this.inquiryId = inquiryId;
  }

  public CqlQueryList getQueries() {
    return queries;
  }

  public void setQueries(CqlQueryList queries) {
    this.queries = queries;
  }
}
