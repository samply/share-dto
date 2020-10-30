package de.samply.share.model.common.result;

import java.util.ArrayList;
import java.util.List;

public class ReplyEntity {

  private String label;

  private long count;

  private List<Stratification> stratifications = new ArrayList<>();

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }

  public List<Stratification> getStratifications() {
    return stratifications;
  }

  public void setStratifications(List<Stratification> stratifications) {
    this.stratifications = stratifications;
  }
}
