package de.samply.share.model.common.result;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Reply {

  private ReplyEntity donor = new ReplyEntity();
  private ReplyEntity sample = new ReplyEntity();
  private String redirectUrl;
  private String site;

  public ReplyEntity getDonor() {
    return donor;
  }

  public void setDonor(ReplyEntity donor) {
    this.donor = donor;
  }

  public ReplyEntity getSample() {
    return sample;
  }

  public void setSample(ReplyEntity sample) {
    this.sample = sample;
  }

  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }
}
