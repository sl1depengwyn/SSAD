package SSAD;

import java.util.ArrayList;


public class HealthRecords {
    private OrganismParameters organismParameters;
    private ArrayList<HealthRecord> healthRecords;

    public HealthRecords() {
        healthRecords = new ArrayList<HealthRecord>();
    }

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