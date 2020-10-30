package de.samply.share.model.common;

import de.samply.share.model.common.result.Stratification;
import java.util.ArrayList;
import java.util.List;

public interface ISamplyResult extends Result {

  int getNumberOfSpecimens();

  int getNumberOfPatients();

  default List<Stratification> getStratificationsOfSpecimens() {
    return new ArrayList<>();
  }

  default List<Stratification> getStratificationsOfPatients() {
    return new ArrayList<>();
  }
}

