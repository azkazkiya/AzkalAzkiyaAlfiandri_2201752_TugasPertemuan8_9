/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No1;
import java.util.Scanner;
/**
 *
 * @author azkiy
 */
public class TestSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Meminta input dari pengguna
        System.out.print("Masukkan sisi1: ");
        double side1 = input.nextDouble();
        System.out.print("Masukkan sisi2: ");
        double side2 = input.nextDouble();
        System.out.print("Masukkan sisi3: ");
        double side3 = input.nextDouble();
        System.out.print("Masukkan warna: ");
        String color = input.next();
        System.out.print("Apakah segitiga terisi (true/false): ");
        boolean filled = input.nextBoolean();

        // Membuat objek Segitiga
        Segitiga segitiga = new Segitiga(side1, side2, side3);
        segitiga.setColor(color);
        segitiga.setFilled(filled);

        // Menampilkan hasil
        
        System.out.println(segitiga.toString());
    }
}
