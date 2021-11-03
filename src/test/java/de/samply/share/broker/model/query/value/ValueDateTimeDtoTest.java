package de.samply.share.broker.model.query.value;

import static org.junit.jupiter.api.Assertions.assertEquals;

import de.samply.share.query.value.ValueDateTimeDto;
import java.time.LocalDateTime;
import java.util.Date;
import org.junit.jupiter.api.Test;

class ValueDateTimeDtoTest {

  private static final Date FIXED_DATE_TIME = java.sql.Timestamp.valueOf(
      LocalDateTime.of(1999, 12, 31, 13, 17, 59));
  private static final String FIXED_DATE_AS_XML_STRING = "31.12.1999T13:17:59";

  @Test
  void testGetValue_Null() {
    ValueDateTimeDto valueDateTimeDto = new ValueDateTimeDto();
    valueDateTimeDto.setValue(null);

    assertEquals("", valueDateTimeDto.getValueAsXmlString());
  }

  @Test
  void testGetMaxValue_Null() {
    ValueDateTimeDto valueDateTimeDto = new ValueDateTimeDto();
    valueDateTimeDto.setMaxValue(null);

    assertEquals("", valueDateTimeDto.getMaxValueAsXmlString());
  }

  @Test
  void testGetValue() {
    ValueDateTimeDto valueDateTimeDto = new ValueDateTimeDto();
    valueDateTimeDto.setValue(FIXED_DATE_TIME);

    assertEquals(FIXED_DATE_AS_XML_STRING, valueDateTimeDto.getValueAsXmlString());
  }

  @Test
  void testGetMaxValue() {
    ValueDateTimeDto valueDateTimeDto = new ValueDateTimeDto();
    valueDateTimeDto.setMaxValue(FIXED_DATE_TIME);

    assertEquals(FIXED_DATE_AS_XML_STRING, valueDateTimeDto.getMaxValueAsXmlString());
  }
}
