package de.samply.share.model.cql;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@SuppressWarnings("WeakerAccess")
@XmlAccessorType(XmlAccessType.FIELD)
public class CqlQueryList {

  @XmlElement(name = "query")
  private List<CqlQuery> queries = new ArrayList<>();

  public List<CqlQuery> getQueries() {
    return queries;
  }

  public void setQueries(List<CqlQuery> queries) {
    this.queries = queries;
  }
}
