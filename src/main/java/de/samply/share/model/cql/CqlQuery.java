package de.samply.share.model.cql;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@SuppressWarnings("WeakerAccess")
@XmlAccessorType(XmlAccessType.FIELD)
public class CqlQuery {

  private String entityType;
  private String cql;

  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public String getCql() {
    return cql;
  }

  public void setCql(String cql) {
    this.cql = cql;
  }
}
