package de.samply.share.query.entity;

import de.samply.share.query.enums.MdrEntity;
import java.io.Serializable;

public class SampleDto extends AbstractQueryEntityDto implements Serializable {

  @Override
  public String getName() {
    return MdrEntity.SAMPLE.getName();
  }
}
