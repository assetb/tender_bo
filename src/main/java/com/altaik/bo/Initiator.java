package com.altaik.bo;

/**
 * Инициатор
 */
public class Initiator extends Company {

    public String firstName;
    public String lastName;
    public String  email;
    public String type;
    public String companyName;
    public String  bin;
    public String description;
    public int id;

    @Override
    public String toString() {
        return "Initiator{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", type='" + type + '\'' +
                ", companyName='" + companyName + '\'' +
                ", bin='" + bin + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                '}';
    }
}
