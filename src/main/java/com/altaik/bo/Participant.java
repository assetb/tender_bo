package com.altaik.bo;

/**
 * Участник торга
 */
public class Participant extends Company {

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
        return "Participant{" +
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
