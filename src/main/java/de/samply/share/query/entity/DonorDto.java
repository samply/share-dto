package de.samply.share.query.entity;

import de.samply.share.query.enums.MdrEntity;
import java.io.Serializable;

public class DonorDto extends AbstractQueryEntityDto implements Serializable {

  @Override
  public String getName() {
    return MdrEntity.DONOR.getName();
  }
}
