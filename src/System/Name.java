package System;

public class Name {
    private String firstName;
    private String middleName;
    private String surname;

    // Constructor with first and last name
    public Name(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    // Constructor with first, middle, and last name
    public Name(String firstName, String middleName, String surname) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.surname = surname;
    }

    // Constructor with only first name
    public Name(String firstName) {
        this.firstName = firstName;
    }

    // Method to get the full name
    public String getName() {
        if (middleName != null && !middleName.isEmpty()) {
            return firstName + " " + middleName + " " + surname;
        } else {
            return firstName + " " + surname;
        }
    }

    // Method to set the full name
    public void setName(String firstName, String middleName, String surname) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.surname = surname;
    }

    // Overloaded setName method for setting only first and last name
    public void setName(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    // Overloaded setName method for setting only the first name
    public void setName(String firstName) {
        this.firstName = firstName;
    }

    // Getters and setters for each field
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
