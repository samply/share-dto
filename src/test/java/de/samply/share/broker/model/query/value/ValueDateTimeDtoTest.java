package de.samply.share.broker.model.query.value;

import de.samply.share.query.value.ValueDateTimeDto;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.junit.MatcherAssert.assertThat;

class ValueDateTimeDtoTest {

    private static Date FIXED_DATE_TIME = java.sql.Timestamp.valueOf(LocalDateTime.of( 1999, 12, 31, 13, 17, 59));
    private static String FIXED_DATE_AS_XML_STRING = "31.12.1999T13:17:59";

    @Test
    void testGetValue_Null() {
        ValueDateTimeDto valueDateTimeDto = new ValueDateTimeDto();
        valueDateTimeDto.setValue(null);

        assertThat(valueDateTimeDto.getValueAsXmlString(), is(""));
    }

    @Test
    void testGetMaxValue_Null() {
        ValueDateTimeDto valueDateTimeDto = new ValueDateTimeDto();
        valueDateTimeDto.setMaxValue(null);

        assertThat(valueDateTimeDto.getMaxValueAsXmlString(), is(""));
    }

    @Test
    void testGetValue() {
        ValueDateTimeDto valueDateTimeDto = new ValueDateTimeDto();
        valueDateTimeDto.setValue(FIXED_DATE_TIME);

        assertThat(valueDateTimeDto.getValueAsXmlString(), is(FIXED_DATE_AS_XML_STRING));
    }

    @Test
    void testGetMaxValue() {
        ValueDateTimeDto valueDateTimeDto = new ValueDateTimeDto();
        valueDateTimeDto.setMaxValue(FIXED_DATE_TIME);

        assertThat(valueDateTimeDto.getMaxValueAsXmlString(), is(FIXED_DATE_AS_XML_STRING));
    }

}
