package de.samply.share.model.cql;

import de.samply.share.model.common.ISamplyResult;
import de.samply.share.model.common.result.Stratification;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class CqlResult implements ISamplyResult, Serializable {

  private static final long serialVersionUID = 1L;

  private int queryId;
  private int numberOfSpecimens;
  private int numberOfPatients;

  private List<Stratification> stratificationsOfSpecimens = new ArrayList<>();
  private List<Stratification> stratificationsOfPatients = new ArrayList<>();

  public int getQueryId() {
    return queryId;
  }

  public void setQueryId(int queryId) {
    this.queryId = queryId;
  }

  public int getNumberOfSpecimens() {
    return numberOfSpecimens;
  }

  public void setNumberOfSpecimens(int numberOfSpecimens) {
    this.numberOfSpecimens = numberOfSpecimens;
  }

  public int getNumberOfPatients() {
    return numberOfPatients;
  }

  public void setNumberOfPatients(int numberOfPatients) {
    this.numberOfPatients = numberOfPatients;
  }

  public List<Stratification> getStratificationsOfSpecimens() {
    return stratificationsOfSpecimens;
  }

  public void setStratificationsOfSpecimens(List<Stratification> stratificationsOfSpecimens) {
    this.stratificationsOfSpecimens = stratificationsOfSpecimens;
  }

  public List<Stratification> getStratificationsOfPatients() {
    return stratificationsOfPatients;
  }

  public void setStratificationsOfPatients(List<Stratification> stratificationsOfPatients) {
    this.stratificationsOfPatients = stratificationsOfPatients;
  }
}
