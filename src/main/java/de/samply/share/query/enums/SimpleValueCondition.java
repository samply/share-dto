package de.samply.share.query.enums;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public enum SimpleValueCondition {
  EQUALS("="),
  NOT_EQUALS("!="),
  LESS("<"),
  GREATER(">"),
  LESS_OR_EQUALS("<="),
  GREATER_OR_EQUALS(">="),
  BETWEEN("⃛");

  private final String shortName;

  SimpleValueCondition(String shortName) {
    this.shortName = shortName;
  }

  /**
   * Get the conditions for a mdr data type.
   * @param mdrDataType the mdr data type
   * @return the conditions for the mdr data type
   */
  public static SimpleValueCondition[] getConditionsForMdr(String mdrDataType) {
    if (StringUtils.equalsIgnoreCase(mdrDataType, "STRING") || StringUtils
        .equalsIgnoreCase(mdrDataType, "ENUMERATED")) {
      List<SimpleValueCondition> simpleValueConditions = new ArrayList<>();
      simpleValueConditions.add(EQUALS);
      simpleValueConditions.add(NOT_EQUALS);
      return simpleValueConditions.toArray(new SimpleValueCondition[0]);
    } else {
      return values();
    }
  }

  public String getShortName() {
    return shortName;
  }

}
