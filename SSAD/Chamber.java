package SSAD;

import java.util.Date;

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
            return true;
        }
        return false;
    }

    public Patient free() {
        if (this.isAvailable()) {
            this.isAvailable = true;
            this.patient.setStatus(new Treated());
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
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Patient getPatient() {
        return this.patient;
    }

    private void setPatient(Patient patient) {
        this.patient = patient;
    }
}