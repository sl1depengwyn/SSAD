package HospitalManagementSystem.Departments;

import HospitalManagementSystem.Common.SQLDB;
import HospitalManagementSystem.PatientDistribution.Chamber;
import HospitalManagementSystem.People.Doctor.Doctor;

import java.util.ArrayList;


public abstract class Department {
    private String name;
    private String specialization;
    private ArrayList<Chamber> chambers;
    private ArrayList<Doctor> doctors;

    public Department(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        chambers = new ArrayList<Chamber>();
        doctors = new ArrayList<Doctor>();
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("INSERT DEPARTMENTS ...%s..%s...", name, specialization));
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("UPDATE DEPARTMENTS ...%s...", name));
    }

    public String getSpecialization() {
        return this.specialization;
    }

    private void setSpecialization(String specialization) {
        this.specialization = specialization;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("UPDATE DEPARTMENTS ...%s...", specialization));
    }

    public ArrayList<Chamber> getAvailableChambers() {
        ArrayList<Chamber> availableChambers = new ArrayList<>(chambers.size());
        for (Chamber chamber : chambers) {
            if (chamber.isAvailable()) {
                availableChambers.add(chamber);
            }
        }
        return availableChambers;
    }

    public void addChamber(Chamber chamber) {
        this.chambers.add(chamber);
    }

    public ArrayList<Doctor> getDoctors() {
        return this.doctors;
    }

    public void addDoctor(Doctor doctor) {
        this.doctors.add(doctor);
    }
}