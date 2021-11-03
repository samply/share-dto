package de.samply.share.essentialquery;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EssentialValueType_DateTimeTest {

  private static final String FIXED_DATE_AS_XML_STRING = "31.12.1999T08:00:13";
  private static final EssentialValueType valueType = EssentialValueType.DATETIME;

  @Test
  void testAsXmlString_Null() {
    assertEquals("", valueType.asXmlString(null));
  }

  @Test
  void testAsXmlString() {
    assertEquals(FIXED_DATE_AS_XML_STRING, valueType.asXmlString(FIXED_DATE_AS_XML_STRING));
  }

  @Test
  void testAsCqlString_Null() {
    assertEquals("", valueType.asCqlString(null));
  }

  @Test
  void testAsCqlString() {
    String FIXED_DATE_AS_CQL_STRING = "@1999-12-31T08:00:13";
    assertEquals(FIXED_DATE_AS_CQL_STRING, valueType.asCqlString(FIXED_DATE_AS_XML_STRING));
  }
}
