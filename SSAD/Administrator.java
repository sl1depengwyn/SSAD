package SSAD;

import java.util.ArrayList;
import java.util.Date;

import SSAD.Person;
import SSAD.Department;

public class Administrator extends Person {

  public Administrator(String firstName, String lastName) {
    super(firstName, lastName);
  }

  private ArrayList<Chamber> getAvailableChambers(Department department) {
    return department.getAvailableChambers();
  }

  public boolean placePatient(Patient patient, Chamber chamber) {
    if (chamber.isAvailable()){
      Accomodation newAccomodation = new Accomodation(new Date(), this);
      newAccomodation.setChamber(chamber);
      patient.setAccomodation(newAccomodation);
      return true;
    } else
      return false;
  }
}