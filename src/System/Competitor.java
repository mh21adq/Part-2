package System;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public abstract class Competitor {
    private int competitorID;
    private static int lastAssignedNumber = 99;
    Name name;
    private String dob; // Date of birth
    private String country;
    private String category;
    private ArrayList<Integer> scores;
    private Date dateOfBirth ;


    public Competitor(Name name, String dob, String country, String category) {
        this.name = name;
        this.dob = dob;
        this.country = country;
        this.category = category;
        String format = "dd/MM/yyyy";
        this.dateOfBirth = convertStringToDate(dob, format);
        this.competitorID=this.assignUniqueNumber();
        scores=new ArrayList<>();

    }

    public int assignUniqueNumber() {
        return lastAssignedNumber++;
    }

    public abstract String getFullDetails(); // Abstract method

    public boolean validateRegistration() {
        // Validation logic
        return true; // or false depending on validation
    }

    public List<Integer> getScores() {
        return scores;
    }

    public abstract void updateInformation(); // Abstract method

    public abstract String getLevel(); // Abstract method

    public void register() {
        // Registration logic
    }

    // Getters and setters for all fields

    // ...
    public Date convertStringToDate(String dateString, String dateFormat) {
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
        try {
            return formatter.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }

    }
    public  int calculateAge() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(this.dob, formatter);
        LocalDate currentDate = LocalDate.now();
        if (birthDate != null && currentDate != null && birthDate.isBefore(currentDate)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            throw new IllegalArgumentException("DOB must be in the past");
        }
    }
public int getID()
{
    return this.competitorID;
}
public void enterScore(int score)
{
    this.scores.add(score);
}
}
