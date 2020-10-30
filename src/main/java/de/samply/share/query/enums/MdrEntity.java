package de.samply.share.query.enums;

public enum MdrEntity {
  DONOR("Donor"),
  SAMPLE("Sample"),
  EVENT("Clinical Data");

  private final String name;

  MdrEntity(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

}
