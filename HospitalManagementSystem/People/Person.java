package HospitalManagementSystem.People;

import HospitalManagementSystem.Common.Address;
import HospitalManagementSystem.Common.SQLDB;

import java.util.Date;

enum Gender {
    nonBinary,
    female,
    male
}

public abstract class Person {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Gender gender;
    private Date birthDate;
    private Address address;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("INSERT PEOPLE ...%s..%s...", firstName, lastName));
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("UPDATE PEOPLE ...%s...", firstName));
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("UPDATE PEOPLE ...%s...", lastName));
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("UPDATE PEOPLE ...%s...", phoneNumber));
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("UPDATE PEOPLE ...%d...", birthDate.getTime()));
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("UPDATE PEOPLE ...%s...", gender.name()));
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
        SQLDB sql = SQLDB.getInstance();
        sql.query(String.format("UPDATE PEOPLE ...%s...%s...%s...%s...%s", address.getCity(), address.getCountry(), address.getPostalCode(), address.getStreet(), address.getState()));
    }
}