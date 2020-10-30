package de.samply.share.model.common.inquiry;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * A collection of inquiry ids and revisions as read from a searchbroker.
 */
@XmlRootElement(name = "Inquiries")
@XmlAccessorType(XmlAccessType.FIELD)
public class InquiriesIdList {

  @XmlElement(name = "Inquiry")
  private List<InquiryId> inquiryIds = new ArrayList<>();

  public List<InquiryId> getInquiryIds() {
    return inquiryIds;
  }

  public void setInquiryIds(List<InquiryId> inquiryIds) {
    this.inquiryIds = inquiryIds;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  public static class InquiryId {

    @XmlElement(name = "Id")
    private String id;

    @XmlElement(name = "Revision")
    private String revision;

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public String getRevision() {
      return revision;
    }

    public void setRevision(String revision) {
      this.revision = revision;
    }
  }
}
