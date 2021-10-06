package SSAD;

import SSAD.Person;
import SSAD.Accomodation;
import SSAD.Status;
import SSAD.Waiting;

public class Patient extends Person {
  private String medicalInsurance;
  private HealthRecords healthRecords;
  private Status status = new Waiting();
  private Accomodation accomodation;

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

  public Accomodation getAccomodation() {
    return this.accomodation;
  }

  public void setAccomodation(Accomodation accomodation) {
    this.accomodation = accomodation;
  }

  public Status getStatus() {
    return this.status;
  }
  public void setStatus(Status status) {
    this.status = status;
  }
}