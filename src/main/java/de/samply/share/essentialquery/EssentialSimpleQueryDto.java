package de.samply.share.essentialquery;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EssentialSimpleQueryDto {

  private List<EssentialSimpleFieldDto> fieldDtos = new ArrayList<>();

  public List<EssentialSimpleFieldDto> getFieldDtos() {
    return fieldDtos;
  }

  public void setFieldDtos(List<EssentialSimpleFieldDto> fieldDtos) {
    this.fieldDtos = fieldDtos;
  }
}
