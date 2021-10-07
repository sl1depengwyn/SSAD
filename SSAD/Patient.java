package SSAD;

public class Patient extends Person {
    private String medicalInsurance;
    private HealthRecords healthRecords;
    private Status status = new Waiting();
    private Accommodation accommodation;

    public Patient(String firstName, String lastName, String medicalInsurance) {
        super(firstName, lastName);
        this.medicalInsurance = medicalInsurance;
    }

    public String getMedicalInsurance() {
        return this.medicalInsurance;
    }

    public void setMedicalInsurance(String medicalInsurance) {
        this.medicalInsurance = medicalInsurance;
    }

    public HealthRecords getHealthRecords() {
        return this.healthRecords;
    }

    public void setHealthRecords(HealthRecords healthRecords) {
        this.healthRecords = healthRecords;
    }

    public Accommodation getAccommodation() {
        return this.accommodation;
    }

    public void setAccommodation(Accommodation accommodation) {
        this.accommodation = accommodation;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}