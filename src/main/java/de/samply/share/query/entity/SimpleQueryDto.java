package de.samply.share.query.entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SimpleQueryDto implements Serializable {

  private DonorDto donorDto = new DonorDto();

  private SampleDto sampleDto = new SampleDto();

  public DonorDto getDonorDto() {
    return donorDto;
  }

  public void setDonorDto(DonorDto donorDto) {
    this.donorDto = donorDto;
  }

  public SampleDto getSampleDto() {
    return sampleDto;
  }

  public void setSampleDto(SampleDto sampleDto) {
    this.sampleDto = sampleDto;
  }
}
