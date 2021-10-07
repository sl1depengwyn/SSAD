package SSAD;

import java.util.ArrayList;

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
    }

    public String getDiagnosis() {
        return this.diagnosis;
    }

    private void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getAnalyzes() {
        return this.analyzes;
    }

    private void setAnalyzes(String analyzes) {
        this.analyzes = analyzes;
    }

    public Float getWeight() {
        return this.weight;
    }

    private void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getHeight() {
        return this.height;
    }

    private void setHeight(Float height) {
        this.height = height;
    }

    public String getBloodPressure() {
        return this.bloodPressure;
    }

    private void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getHeartRate() {
        return this.heartRate;
    }

    private void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public Doctor getDoctor() {
        return this.doctor;
    }

    private void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}