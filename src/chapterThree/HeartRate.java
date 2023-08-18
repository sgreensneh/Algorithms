package chapterThree;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HeartRate {
    private String firstName;
    private String lastName;
    private String dob;
    private int age;

    private  int  maximumHeartRate;

    public HeartRate(String firstName, String lastName, String dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int  calculateAge(String dob){
        this.dob = dob;
        LocalDate localDate = LocalDate.now();
        LocalDate userDate = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        age = Period.between(userDate, localDate).getYears();
        return age;
    }

    public int calculateMaximumHeartRate(int age){
        maximumHeartRate = 220 - age;
        return maximumHeartRate;
    }

    public  double calculateTargetHeartRate(int maximumHeartRate){
        double targetHeartRate = 0;
        targetHeartRate = 0.5 * maximumHeartRate;
        return targetHeartRate;
    }

    @Override
    public String toString() {
        return String.format("""
                FirstName: %s
                LastName: %s
                Dob: %s
                Age: %s
                MaximumHeartRate: %s
                TargetHeartRate: %s

                """, firstName, lastName, dob, calculateAge(dob), calculateMaximumHeartRate(age), calculateTargetHeartRate(maximumHeartRate));
    }
}
