package de.samply.share.query.value;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ValueDecimalDto extends AbstractQueryValueWithoutAdapterDto<Double> implements
    Serializable {

  public ValueDecimalDto() {
    super(0d);
  }
}
