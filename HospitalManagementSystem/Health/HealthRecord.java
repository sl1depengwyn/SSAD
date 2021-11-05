package HospitalManagementSystem.Health;

import HospitalManagementSystem.Common.SQLDB;
import HospitalManagementSystem.People.Doctor.Doctor;

public class HealthRecord {
    private String diagnosis;
    private String analyzes;
    private Float weight;
    private Float height;
    private String bloodPressure;
    private int heartRate;
    private Doctor doctor;

    public HealthRecord(String diagnosis, String analyzes, Float weight, Float height, String bloodPressure,
                        int heartRate, Doctor doctor) {
        this.diagnosis = diagnosis;
        this.analyzes = analyzes;
        this.weight = weight;
        this.height = height;
        this.bloodPressure = bloodPressure;
        this.heartRate = heartRate;
        this.doctor = doctor;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("INSERT HEALTH_RECORDS ...%s..%s..%f..%f..%s..%d..%s", diagnosis, analyzes, weight, height, bloodPressure, heartRate, doctor.getFirstName().concat(doctor.getLastName())));
    }

    public String getDiagnosis() {
        return this.diagnosis;
    }

    private void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("UPDATE HEALTH_RECORDS ...%s...", diagnosis));
    }

    public String getAnalyzes() {
        return this.analyzes;
    }

    private void setAnalyzes(String analyzes) {
        this.analyzes = analyzes;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("UPDATE HEALTH_RECORDS ...%s...", analyzes));
    }

    public Float getWeight() {
        return this.weight;
    }

    private void setWeight(Float weight) {
        this.weight = weight;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("UPDATE HEALTH_RECORDS ...%f...", weight));
    }

    public Float getHeight() {
        return this.height;
    }

    private void setHeight(Float height) {
        this.height = height;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("UPDATE HEALTH_RECORDS ...%f...", height));
    }

    public String getBloodPressure() {
        return this.bloodPressure;
    }

    private void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("UPDATE HEALTH_RECORDS ...%s...", bloodPressure));
    }

    public int getHeartRate() {
        return this.heartRate;
    }

    private void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("UPDATE HEALTH_RECORDS ...%d...", heartRate));
    }

    public Doctor getDoctor() {
        return this.doctor;
    }

    private void setDoctor(Doctor doctor) {
        this.doctor = doctor;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("UPDATE HEALTH_RECORDS ...%s...", doctor.getFirstName().concat(doctor.getLastName())));
    }
}