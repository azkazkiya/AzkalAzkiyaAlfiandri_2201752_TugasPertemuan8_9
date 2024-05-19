/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No2;

/**
 *
 * @author azkiy
 */
public class Student extends Person {
    public static final String TahunPertama= "Tahun Pertama";
    public static final String TahunKedua = "Tahun Kedua";
    public static final String Junior = "Junior";
    public static final String Senior = "Senior";

    private String status;
    public Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }
    @Override
    public String toString() {
        return "Class: Student, Name: " + getName();
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}

