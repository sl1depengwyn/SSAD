package SSAD;

import java.util.ArrayList;

public class Doctor extends Person {
    private String speciality;
    private ArrayList<Patient> patients;
    private Department department;

    public Doctor(String firstName, String lastName, String speciality) {
        super(firstName, lastName);
        this.speciality = speciality;
        patients = new ArrayList<Patient>();
    }

    public void assignPatient(Patient patient) {
        patient.setStatus(new Treating());
        this.patients.add(patient);
    }

    public ArrayList<Patient> getPatients() {
        return this.patients;
    }

    public String getSpeciality() {
        return this.speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}