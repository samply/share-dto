package de.samply.share.query.value;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ValueIntegerDto extends AbstractQueryValueWithoutAdapterDto<Integer> implements
    Serializable {

  public ValueIntegerDto() {
    super(0);
  }
}
