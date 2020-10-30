package de.samply.share.model.bbmri;

import de.samply.share.model.osse.Entity;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sample", namespace = "http://schema.samply.de/bbmri/Sample")
public class Sample extends Entity implements Serializable {

  @XmlAttribute(name = "Organ")
  protected String organ;
  @XmlAttribute(name = "samplecontextid")
  protected String samplecontextid;

  public String getOrgan() {
    return organ;
  }

  public void setOrgan(String organ) {
    organ = this.organ;
  }

  public String getSamplecontextid() {
    return samplecontextid;
  }

  public void setSamplecontextid(String samplecontextid) {
    this.samplecontextid = samplecontextid;
  }
}
