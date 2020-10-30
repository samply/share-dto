package de.samply.share.query.field;

import de.samply.share.query.common.PermittedValue;
import de.samply.share.query.value.ValuePermittedValuesDto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class FieldPermittedValueDto extends AbstractQueryFieldDto<String, ValuePermittedValuesDto>
    implements Serializable {

  @XmlTransient
  private List<PermittedValue> permittedValues = new ArrayList<>();

  public List<PermittedValue> getPermittedValues() {
    return permittedValues;
  }

  public void setPermittedValues(List<PermittedValue> permittedValues) {
    this.permittedValues = permittedValues;
  }
}
