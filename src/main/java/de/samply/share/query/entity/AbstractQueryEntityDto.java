package de.samply.share.query.entity;

import de.samply.share.query.field.AbstractQueryFieldDto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElementRef;

public abstract class AbstractQueryEntityDto implements Serializable {

  private List<AbstractQueryFieldDto<?, ?>> fieldsDto = new ArrayList<>();

  // TODO: Retrieve name from MDR
  public abstract String getName();

  @XmlElementRef
  public List<AbstractQueryFieldDto<?, ?>> getFieldsDto() {
    return fieldsDto;
  }

  public void setFieldsDto(List<AbstractQueryFieldDto<?, ?>> fieldsDto) {
    this.fieldsDto = fieldsDto;
  }
}
