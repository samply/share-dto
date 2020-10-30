package de.samply.share.query.value;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang3.StringUtils;

@XmlRootElement
public class ValueStringDto extends AbstractQueryValueWithoutAdapterDto<String> implements
    Serializable {

  public ValueStringDto() {
    super(StringUtils.EMPTY);
  }
}
