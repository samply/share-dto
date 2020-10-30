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
@XmlType(name = "Donor", namespace = "http://schema.samply.de/bbmri/Donor", propOrder = {
    "sampleContext"
})
public class Donor extends Entity implements Serializable {

  @XmlElement(name = "sampleContext", namespace = "http://schema.samply.de/bbmri/Sample")
  protected List<SampleContext> sampleContext;
  @XmlAttribute(name = "id")
  protected String id;
  @XmlAttribute(name = "geschlecht")
  protected String geschlecht;

  public List<SampleContext> getSampleContext() {
    return sampleContext;
  }

  public void setSampleContext(List<SampleContext> sampleContext) {
    this.sampleContext = sampleContext;
  }

  @Override
  public String getId() {
    return id;
  }

  @Override
  public void setId(String id) {
    this.id = id;
  }

  public String getGeschlecht() {
    return geschlecht;
  }

  public void setGeschlecht(String geschlecht) {
    this.geschlecht = geschlecht;
  }
}
