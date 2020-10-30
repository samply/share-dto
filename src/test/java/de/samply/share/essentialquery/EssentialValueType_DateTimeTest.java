package de.samply.share.essentialquery;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.junit.MatcherAssert.assertThat;

class EssentialValueType_DateTimeTest {

    private static String FIXED_DATE_AS_XML_STRING = "31.12.1999T08:00:13";
    private static String FIXED_DATE_AS_CQL_STRING = "@1999-12-31T08:00:13";

    private static final EssentialValueType valueType = EssentialValueType.DATETIME;

    @Test
    void testAsXmlString_Null() {
        assertThat(valueType.asXmlString(null), is(""));
    }

    @Test
    void testAsXmlString() {
        assertThat(valueType.asXmlString(FIXED_DATE_AS_XML_STRING), is(FIXED_DATE_AS_XML_STRING));
    }

    @Test
    void testAsCqlString_Null() {
        assertThat(valueType.asCqlString(null), is(""));
    }

    @Test
    void testAsCqlString() {
        assertThat(valueType.asCqlString(FIXED_DATE_AS_XML_STRING), is(FIXED_DATE_AS_CQL_STRING));
    }
}
