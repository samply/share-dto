package de.samply.share.query.field;

import de.samply.share.query.common.MdrFieldDto;
import de.samply.share.query.value.AbstractQueryValueDto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlSeeAlso({
    FieldDateDto.class,
    FieldDateTimeDto.class,
    FieldDecimalDto.class,
    FieldIntegerDto.class,
    FieldPermittedValueDto.class,
    FieldStringDto.class
})
public abstract class AbstractQueryFieldDto<
    FieldT, ValueDtoT extends AbstractQueryValueDto<FieldT>>
    implements Serializable {

  private List<ValueDtoT> valuesDto = new ArrayList<>();

  private MdrFieldDto mdrFieldDto;

  @XmlElementRef
  public List<ValueDtoT> getValuesDto() {
    return valuesDto;
  }

  public void setValuesDto(List<ValueDtoT> valuesDto) {
    this.valuesDto = valuesDto;
  }

  public String getName() {
    return mdrFieldDto.getName();
  }

  public String getUrn() {
    return mdrFieldDto.getUrn();
  }

  public MdrFieldDto getMdrFieldDto() {
    return mdrFieldDto;
  }

  public void setMdrFieldDto(MdrFieldDto mdrFieldDto) {
    this.mdrFieldDto = mdrFieldDto;
  }
}
