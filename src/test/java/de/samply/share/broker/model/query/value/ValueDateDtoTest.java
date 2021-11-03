package de.samply.share.broker.model.query.value;

import static org.junit.jupiter.api.Assertions.assertEquals;

import de.samply.share.query.value.ValueDateDto;
import java.time.LocalDate;
import java.util.Date;
import org.junit.jupiter.api.Test;

class ValueDateDtoTest {

  private static final Date FIXED_DATE = java.sql.Date.valueOf(LocalDate.of(1999, 12, 31));
  private static final String FIXED_DATE_AS_XML_STRING = "31.12.1999";

  @Test
  void testGetValue_Null() {
    ValueDateDto valueDateDto = new ValueDateDto();
    valueDateDto.setValue(null);

    assertEquals("", valueDateDto.getValueAsXmlString());
  }

  @Test
  void testGetMaxValue_Null() {
    ValueDateDto valueDateDto = new ValueDateDto();
    valueDateDto.setMaxValue(null);

    assertEquals("", valueDateDto.getMaxValueAsXmlString());
  }

  @Test
  void testGetValue() {
    ValueDateDto valueDateDto = new ValueDateDto();
    valueDateDto.setValue(FIXED_DATE);

    assertEquals(FIXED_DATE_AS_XML_STRING, valueDateDto.getValueAsXmlString());
  }

  @Test
  void testGetMaxValue() {
    ValueDateDto valueDateDto = new ValueDateDto();
    valueDateDto.setMaxValue(FIXED_DATE);

    assertEquals(FIXED_DATE_AS_XML_STRING, valueDateDto.getMaxValueAsXmlString());
  }
}
