package de.samply.share.model.bbmri;

import de.samply.share.model.osse.Entity;
import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SampleContext", namespace = "http://schema.samply.de/bbmri/SampleContext", propOrder = {
    "sample"
})
public class SampleContext extends Entity implements Serializable {

  @XmlAttribute(name = "CDC_Histometastasis")
  protected String cdcHistometastasis;
  @XmlAttribute(name = "id")
  protected String id;

  @XmlElement(name = "Sample", namespace = "http://schema.samply.de/bbmri/SampleContext")
  protected List<Sample> sample;


  public String getCdcHistometastasis() {
    return cdcHistometastasis;
  }

  public void setCdcHistometastasis(String cdcHistometastasis) {
    this.cdcHistometastasis = cdcHistometastasis;
  }

  public List<Sample> getSample() {
    return sample;
  }

  public void setSample(List<Sample> sample) {
    this.sample = sample;
  }

  @Override
  public String getId() {
    return id;
  }

  @Override
  public void setId(String id) {
    this.id = id;
  }
}
