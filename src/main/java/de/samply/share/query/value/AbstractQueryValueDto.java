package de.samply.share.query.value;

import de.samply.share.query.enums.SimpleValueCondition;
import java.io.Serializable;
import java.util.Objects;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import org.apache.commons.lang3.StringUtils;

@XmlSeeAlso({
    ValueDateDto.class,
    ValueIntegerDto.class,
    ValuePermittedValuesDto.class,
    ValueDecimalDto.class,
    ValueDateDto.class,
    ValueDateTimeDto.class,
    ValueStringDto.class
})
public abstract class AbstractQueryValueDto<ValueT> implements Serializable {

  private ValueT value;
  private ValueT maxValue;
  private SimpleValueCondition condition = SimpleValueCondition.EQUALS;

  AbstractQueryValueDto() {
  }

  AbstractQueryValueDto(ValueT defaultValue) {
    this.value = defaultValue;
    this.maxValue = defaultValue;
  }

  @XmlTransient
  public ValueT getValue() {
    return value;
  }

  public void setValue(ValueT value) {
    this.value = value;
  }

  @XmlTransient
  public ValueT getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(ValueT maxValue) {
    this.maxValue = maxValue;
  }

  @XmlTransient
  public String getValueAsXmlString() {
    return Objects.toString(value, StringUtils.EMPTY);
  }

  @XmlTransient
  public String getMaxValueAsXmlString() {
    return Objects.toString(maxValue, StringUtils.EMPTY);
  }

  @XmlTransient
  public String getValueAsCqlString() {
    return Objects.toString(value, StringUtils.EMPTY);
  }

  @XmlTransient
  public String getMaxValueAsCqlString() {
    return Objects.toString(maxValue, StringUtils.EMPTY);
  }

  /**
   * Get the shortname of the condition.
   * @return the shortname
   */
  public String getConditionShortName() {
    if (condition == null) {
      return StringUtils.EMPTY;
    }

    return condition.getShortName();
  }

  public SimpleValueCondition getCondition() {
    return condition;
  }

  public void setCondition(SimpleValueCondition condition) {
    this.condition = condition;
  }
}
