package de.samply.share.query.enums;

public enum MdrDataType {
  STRING,
  INTEGER,
  FLOAT,
  DATE,
  DATETIME,
  ENUMERATED;

  /**
   * Return the Mdr data type and ignore case.
   * @param name mdr type in string
   * @return MdrType
   */
  public static MdrDataType valueOfIgnoreCase(String name) {
    if (name == null) {
      return null;
    }

    return MdrDataType.valueOf(name.toUpperCase());
  }
}
