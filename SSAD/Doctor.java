package SSAD;

import java.util.ArrayList;

import SSAD.Person;
import SSAD.Accomodation;
import SSAD.Department;
import SSAD.Treating;

public class Doctor extends Person {
  private String speciality;
  private ArrayList<Patient> patients = new ArrayList<Patient>();
  private Department department;

  public Doctor(String firstName, String lastName, String speciality) {
    super(firstName, lastName);
    this.speciality = speciality;
  }

  public ArrayList<Patient> getPatients() {
    return this.patients;
  }
  public void assignPatient(Patient patient) {
    patient.setStatus(new Treating());
    this.patients.add(patient);
  }

  public String getSpeciality() {
    return this.speciality;
  }
  public void setSpeciality(String speciality) {
    this.speciality = speciality;
  }
}