package de.samply.share.essentialquery;

import de.samply.share.query.enums.SimpleValueCondition;
import javax.xml.bind.annotation.XmlAttribute;

public class EssentialSimpleValueDto {

  private SimpleValueCondition condition = SimpleValueCondition.EQUALS;

  private String value = "";

  private String maxValue = "";

  @XmlAttribute
  public SimpleValueCondition getCondition() {
    return condition;
  }

  public void setCondition(SimpleValueCondition condition) {
    this.condition = condition;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(String maxValue) {
    this.maxValue = maxValue;
  }
}
