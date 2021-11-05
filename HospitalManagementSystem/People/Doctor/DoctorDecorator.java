package HospitalManagementSystem.People.Doctor;

import HospitalManagementSystem.Departments.Department;
import HospitalManagementSystem.People.Patient;

import java.util.ArrayList;

public abstract class DoctorDecorator extends Doctor {

    protected Doctor wrappee;

    DoctorDecorator(Doctor doctor) {
        super(doctor.getFirstName(), doctor.getLastName());
        wrappee = doctor;
    }

    @Override
    public void assignPatient(Patient patient) {
        wrappee.assignPatient(patient);
    }

    @Override
    public void treatPatient(Patient patient) {
        wrappee.treatPatient(patient);
    }

    @Override
    public ArrayList<Patient> getPatients() {
        return wrappee.getPatients();
    }

    @Override
    public String getSpeciality() {
        return wrappee.getSpeciality();
    }

    @Override
    public Department getDepartment() {
        return wrappee.getDepartment();
    }

    @Override
    public void setDepartment(Department department) {
        wrappee.setDepartment(department);
    }
}
