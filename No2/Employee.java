/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No2;

/**
 *
 * @author azkiy
 */
public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String email, 
            String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Class: Employee, Name: " + getName();
    }
    public String getOffice() {
        return office;
    }
    public double getSalary() {
        return salary;
    }
    public MyDate getDateHired() {
        return dateHired;
    }
    public void setOffice(String office) {
        this.office = office;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }
}
