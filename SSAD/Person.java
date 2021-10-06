package SSAD;

import java.util.Date;
import SSAD.Address;

abstract class Person {
    enum Gender {
      nonBinary,
      female,
      male
    }

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Gender gender;
    private Date birthDate;
    private Address address;

    public Person(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
    }

    public Person(String firstName, String lastName, Gender gender, Date birthDate) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.gender = gender;
      this.birthDate = birthDate;
    }

    public String getFirstName() {
      return this.firstName;
    }
    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }

    public String getLastName() {
      return this.lastName;
    }
    public void setLastName(String lastName) {
      this.lastName = lastName;
    }

    public String getPhoneNumber() {
      return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
    }

    public Date getBirthDate() {
      return this.birthDate;
    }
    public void setBirthDate(Date birthDate) {
      this.birthDate = birthDate;
    }
    
    public Gender getGender() {
      return this.gender;
    }
    public void setGender(Gender gender) {
      this.gender = gender;
    }

    public Address getAddress() {
      return this.address;
    }
    public void setAddress(Address address) {
      this.address = address;
    }
}