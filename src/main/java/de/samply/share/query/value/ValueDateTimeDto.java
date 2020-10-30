package de.samply.share.query.value;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang3.StringUtils;

@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class ValueDateTimeDto extends AbstractQueryValueDto<Date> implements Serializable {

  private static SimpleDateFormat DATE_FORMAT_XML = new SimpleDateFormat("dd.MM.yyyy'T'HH:mm:ss");

  @Override
  @XmlElement
  public Date getMaxValue() {
    return super.getMaxValue();
  }

  @Override
  public void setMaxValue(Date maxValue) {
    super.setMaxValue(maxValue);
  }

  @Override
  @XmlElement
  public Date getValue() {
    return super.getValue();
  }

  @Override
  public void setValue(Date date) {
    super.setValue(date);
  }

  public String getValueAsXmlString() {
    return getXmlFormatedDate(getValue());
  }

  public String getMaxValueAsXmlString() {
    return getXmlFormatedDate(getMaxValue());
  }

  private String getXmlFormatedDate(Date date) {
    if (date == null) {
      return StringUtils.EMPTY;
    }

    return DATE_FORMAT_XML.format(date);
  }
}
