package de.samply.share.query.common;

import java.io.Serializable;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class PermittedValue implements Serializable {

  private String mdrKey = StringUtils.EMPTY;

  private String mdrDesignation = StringUtils.EMPTY;

  public String getMdrKey() {
    return mdrKey;
  }

  public void setMdrKey(String mdrKey) {
    this.mdrKey = mdrKey;
  }

  public String getMdrDesignation() {
    return mdrDesignation;
  }

  public void setMdrDesignation(String mdrDesignation) {
    this.mdrDesignation = mdrDesignation;
  }

  @Override
  public String toString() {
    return mdrDesignation;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof PermittedValue)) {
      return false;
    }
    PermittedValue compare = (PermittedValue) obj;

    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.mdrKey, compare.mdrKey);
    builder.append(this.mdrDesignation, compare.mdrDesignation);
    return builder.build();
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(mdrKey);
    builder.append(mdrDesignation);
    return builder.build();
  }
}
