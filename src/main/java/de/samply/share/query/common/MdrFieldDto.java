package de.samply.share.query.common;

import de.samply.share.query.enums.MdrDataType;
import de.samply.share.query.enums.MdrEntity;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class MdrFieldDto implements Serializable {

  private MdrEntity mdrEntity;
  private MdrDataType dataType;
  private String urn;
  private String name;

  private List<PermittedValue> permittedValues;

  public MdrEntity getMdrEntity() {
    return mdrEntity;
  }

  public void setMdrEntity(MdrEntity mdrEntity) {
    this.mdrEntity = mdrEntity;
  }

  public MdrDataType getDataType() {
    return dataType;
  }

  public void setDataType(MdrDataType dataType) {
    this.dataType = dataType;
  }

  public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // Skip permitted values from equals() and hashCode()
  public List<PermittedValue> getPermittedValues() {
    return permittedValues;
  }

  public void setPermittedValues(List<PermittedValue> permittedValues) {
    this.permittedValues = permittedValues;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof MdrFieldDto)) {
      return false;
    }
    MdrFieldDto compare = (MdrFieldDto) obj;

    EqualsBuilder builder = new EqualsBuilder();

    builder.append(this.dataType, compare.dataType);
    builder.append(this.mdrEntity, compare.mdrEntity);
    builder.append(this.name, compare.name);
    builder.append(this.urn, compare.urn);

    return builder.isEquals();
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    builder.append(dataType);
    builder.append(mdrEntity);
    builder.append(name);
    builder.append(urn);

    return builder.toHashCode();
  }

  @Override
  public String toString() {
    ToStringBuilder builder = new ToStringBuilder(this);

    builder.append("Name", name);
    builder.append("URN", urn);
    builder.append("Type", dataType);
    builder.append("Entity", mdrEntity);

    return builder.build();
  }
}
