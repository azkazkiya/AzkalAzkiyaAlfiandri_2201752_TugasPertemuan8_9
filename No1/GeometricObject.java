/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No1;

/**
 *
 * @author azkiy
 */
public class GeometricObject {
     private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    // Konstruktor tanpa argumen
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    // Konstruktor dengan parameter
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    // Getter dan setter untuk color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter dan setter untuk filled
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Getter untuk dateCreated
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    // Metode toString
    public String toString() {
        return "Created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
}
