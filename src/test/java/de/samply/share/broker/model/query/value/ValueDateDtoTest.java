package de.samply.share.broker.model.query.value;

import de.samply.share.query.value.ValueDateDto;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.junit.MatcherAssert.assertThat;

class ValueDateDtoTest {

    private static Date FIXED_DATE = java.sql.Date.valueOf(LocalDate.of(1999, 12, 31));
    private static String FIXED_DATE_AS_XML_STRING = "31.12.1999";

    @Test
    void testGetValue_Null() {
        ValueDateDto valueDateDto = new ValueDateDto();
        valueDateDto.setValue(null);

        assertThat(valueDateDto.getValueAsXmlString(), is(""));
    }

    @Test
    void testGetMaxValue_Null() {
        ValueDateDto valueDateDto = new ValueDateDto();
        valueDateDto.setMaxValue(null);

        assertThat(valueDateDto.getMaxValueAsXmlString(), is(""));
    }

    @Test
    void testGetValue() {
        ValueDateDto valueDateDto = new ValueDateDto();
        valueDateDto.setValue(FIXED_DATE);

        assertThat(valueDateDto.getValueAsXmlString(), is(FIXED_DATE_AS_XML_STRING));
    }

    @Test
    void testGetMaxValue() {
        ValueDateDto valueDateDto = new ValueDateDto();
        valueDateDto.setMaxValue(FIXED_DATE);

        assertThat(valueDateDto.getMaxValueAsXmlString(), is(FIXED_DATE_AS_XML_STRING));
    }

}
