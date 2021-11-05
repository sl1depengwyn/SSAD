package HospitalManagementSystem.People.Doctor;

import HospitalManagementSystem.Departments.Department;
import HospitalManagementSystem.People.Patient;
import HospitalManagementSystem.People.Person;
import HospitalManagementSystem.Stasuses.Treating;

import java.util.ArrayList;

public abstract class Doctor extends Person {
    private String speciality = "";
    private ArrayList<Patient> patients;
    private Department department;

    public Doctor(String firstName, String lastName) {
        super(firstName, lastName);
        patients = new ArrayList<Patient>();
    }

    public void assignPatient(Patient patient) {
        patient.setStatus(new Treating());
        this.patients.add(patient);
    }

    public abstract void treatPatient(Patient patient);

    public ArrayList<Patient> getPatients() {
        return this.patients;
    }

    public String getSpeciality() {
        return this.speciality;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}