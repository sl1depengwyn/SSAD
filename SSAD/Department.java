package SSAD;

import java.util.Date;
import java.util.ArrayList;
import SSAD.Chamber;
import SSAD.Doctor;

public class Department {
    private String name;
    private String spezialization;
    private ArrayList<Chamber> chambers = new ArrayList<Chamber>();
    private ArrayList<Doctor> doctors = new ArrayList<Doctor>();

    public Department(String name, String spezialization) {
      this.name = name;
      this.spezialization = spezialization;
    }

    public String getName() {
      return this.name;
    }
    public void setName(String name) {
      this.name = name;
    }

    public String getSpezialization() {
      return this.spezialization;
    }
    private void setSpezialization(String spezialization) {
      this.spezialization = spezialization;
    }

    public ArrayList<Chamber> getAvailableChambers() {
      return this.chambers;
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