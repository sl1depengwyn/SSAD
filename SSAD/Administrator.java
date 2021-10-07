package SSAD;

import java.util.ArrayList;
import java.util.Date;

public class Administrator extends Person {

    public Administrator(String firstName, String lastName) {
        super(firstName, lastName);
    }

    private ArrayList<Chamber> getAvailableChambers(Department department) {
        return department.getAvailableChambers();
    }

    public boolean placePatient(Patient patient, Chamber chamber) {
        if (chamber.isAvailable()) {
            Accommodation newAccommodation = new Accommodation(new Date(), this);
            newAccommodation.setChamber(chamber);
            patient.setAccommodation(newAccommodation);
            patient.setStatus(new Treating());
            return true;
        } else {
            patient.setStatus(new Waiting());
            System.out.println("Chamber is not available!");
            return false;
        }
    }

    public boolean processPatient(Patient patient, Department department) {
        Chamber chamber = chooseSuitable(patient, department);
        if (chamber != null) {
            Accommodation newAccommodation = new Accommodation(new Date(), this);
            newAccommodation.setChamber(chamber);
            patient.setAccommodation(newAccommodation);
            patient.setStatus(new Treating());
            return true;
        } else {
            patient.setStatus(new Waiting());
            System.out.printf("There are no available chambers in %s!\n", department.getName());
            return false;
        }
    }

    public void dischargePatient(Patient patient) {
        patient.getAccommodation().finish();
        patient.setAccommodation(null);
        patient.setStatus(new Treated());
    }

    public Chamber chooseSuitable(Patient patient, Department department) {
        ArrayList<Chamber> availableChambers = getAvailableChambers(department);
        if (availableChambers.size() == 0) {
            System.out.printf("There are no available chambers in %s!\n", department.getName());
            return null;
        }
        return availableChambers.get(0);
    }
}