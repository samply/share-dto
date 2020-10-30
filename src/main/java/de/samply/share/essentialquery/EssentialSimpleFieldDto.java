package de.samply.share.essentialquery;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;

public class EssentialSimpleFieldDto {

  private String urn = "";

  private EssentialValueType valueType;

  private List<EssentialSimpleValueDto> valueDtos = new ArrayList<>();

  @XmlAttribute
  public String getUrn() {
    return urn;
  }

  public void setUrn(String urn) {
    this.urn = urn;
  }

  @XmlAttribute
  public EssentialValueType getValueType() {
    return valueType;
  }

  public void setValueType(EssentialValueType valueType) {
    this.valueType = valueType;
  }

  public List<EssentialSimpleValueDto> getValueDtos() {
    return valueDtos;
  }

  public void setValueDtos(List<EssentialSimpleValueDto> valueDtos) {
    this.valueDtos = valueDtos;
  }
}
