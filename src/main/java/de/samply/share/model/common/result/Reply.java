package de.samply.share.model.common.result;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Reply {

  private ReplyEntity donor = new ReplyEntity();
  private ReplyEntity sample = new ReplyEntity();

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
}
