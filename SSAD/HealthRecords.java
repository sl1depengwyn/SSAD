package SSAD;

import java.util.ArrayList;

import SSAD.HealthRecord;
import SSAD.OrganismParameters;

public class HealthRecords {
  private OrganismParameters organismParameters;
  private ArrayList<HealthRecord> healthRecords = new ArrayList<HealthRecord>();

  public OrganismParameters getOrganismParameters() {
    return this.organismParameters;
  }

  public void setOrganismParameters(OrganismParameters organismParameters) {
    this.organismParameters = organismParameters;
  }

  public ArrayList<HealthRecord> getHealthRecords() {
    return this.healthRecords;
  }

  public void addRecord(HealthRecord healthRecord) {
    this.healthRecords.add(healthRecord);
  }
}