/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No2;

/**
 *
 * @author azkiy
 */
public class Faculty extends Employee {
    
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, 
        String email, String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Class: Faculty, Name: " + getName();
    }

    // Getter dan setter untuk properti
    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}

