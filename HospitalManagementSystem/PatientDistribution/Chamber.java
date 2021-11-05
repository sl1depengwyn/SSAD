package HospitalManagementSystem.PatientDistribution;

import HospitalManagementSystem.Common.SQLDB;
import HospitalManagementSystem.Departments.Department;
import HospitalManagementSystem.People.Patient;
import HospitalManagementSystem.Stasuses.Treated;

public class Chamber {
    private int id;
    private boolean isAvailable;
    private Department department;
    private String roomNumber;
    private Patient patient;

    public Chamber(Department department, String roomNumber, int id) {
        this.department = department;
        this.roomNumber = roomNumber;
        this.id = id;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("INSERT CHAMBERS ...%d...", id));
    }

    public int getId() {
        return this.id;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public boolean take(Patient patient) {
        if (!this.isAvailable()) {
            this.patient = patient;
            this.isAvailable = false;
            SQLDB sql = SQLDB.getInstance();
            sql.query(String.format("UPDATE CHAMBERS ...%d..%s.%b", id, patient.getFirstName().concat(patient.getLastName()), isAvailable));
            return true;
        }
        return false;
    }

    public Patient free() {
        if (this.isAvailable()) {
            this.isAvailable = true;
            this.patient.setStatus(new Treated());
            SQLDB sql = SQLDB.getInstance();
            sql.query(String.format("UPDATE CHAMBERS ...%b", isAvailable));
            return this.patient;
        } else {
            System.out.println("This chamber is already free!");
            return null;
        }
    }

    public Department getDepartment() {
        return this.department;
    }

    public void seDepartment(Department department) {
        this.department = department;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("UPDATE CHAMBERS ...%s", department.getName()));
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("UPDATE CHAMBERS ...%s", roomNumber));
    }

    public Patient getPatient() {
        return this.patient;
    }

    private void setPatient(Patient patient) {
        this.patient = patient;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("UPDATE CHAMBERS ...%s", patient.getFirstName().concat(patient.getLastName())));
    }
}