package de.samply.share.query.value;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlSeeAlso({
    ValueDateDto.class,
    ValueIntegerDto.class,
    ValuePermittedValuesDto.class,
    ValueDecimalDto.class,
    ValueDateDto.class,
    ValueDateTimeDto.class,
    ValueStringDto.class
})
public abstract class AbstractQueryValueWithoutAdapterDto<ValueT> extends
    AbstractQueryValueDto<ValueT> {

  public AbstractQueryValueWithoutAdapterDto() {
    super();
  }

  AbstractQueryValueWithoutAdapterDto(ValueT value) {
    super(value);
  }

  @Override
  @XmlElement
  public ValueT getValue() {
    return super.getValue();
  }

  @Override
  public void setValue(ValueT value) {
    super.setValue(value);
  }

  @Override
  @XmlElement
  public ValueT getMaxValue() {
    return super.getMaxValue();
  }

  @Override
  public void setMaxValue(ValueT maxValue) {
    super.setMaxValue(maxValue);
  }

}
