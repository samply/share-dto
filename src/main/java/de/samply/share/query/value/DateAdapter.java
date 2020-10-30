package de.samply.share.query.value;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, Date> {

  private final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

  @Override
  public Date unmarshal(String date) throws Exception {
    return dateFormat.parse(date);
  }

  @Override
  public String marshal(Date date) {
    if (date != null) {
      return dateFormat.format(date);
    } else {
      return null;
    }
  }
}
