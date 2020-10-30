package de.samply.share.model.common.result;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Stratification {

  private String title = "";
  private List<Stratum> strata = new ArrayList<>();

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public List<Stratum> getStrata() {
    return strata;
  }

  public void setStrata(List<Stratum> strata) {
    this.strata = strata;
  }
}

