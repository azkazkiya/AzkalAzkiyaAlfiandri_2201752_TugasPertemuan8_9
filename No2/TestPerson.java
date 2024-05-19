/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No2;
import java.util.Scanner;
/**
 *
 * @author azkiy
 */
public class TestPerson {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person person = null;

        System.out.println("Pilih jenis data yang ingin diinput:");
        System.out.println("1. Person");
        System.out.println("2. Student");
        System.out.println("3. Employee");
        System.out.println("4. Faculty");
        System.out.println("5. Staff");
        System.out.print("Masukkan pilihan (1-5): ");
        int choice = input.nextInt();
        input.nextLine(); // consume newline

        System.out.print("Masukkan nama: ");
        String name = input.nextLine();
        System.out.print("Masukkan alamat: ");
        String address = input.nextLine();
        System.out.print("Masukkan nomor telepon: ");
        String phoneNumber = input.nextLine();
        System.out.print("Masukkan email: ");
        String email = input.nextLine();

        switch (choice) {
            case 1:
                person = new Person(name, address, phoneNumber, email);
                break;
            case 2:
                System.out.println("Pilih status mahasiswa:");
                System.out.println("1. Freshman");
                System.out.println("2. Sophomore");
                System.out.println("3. Junior");
                System.out.println("4. Senior");
                System.out.print("Masukkan pilihan (1-4): ");
                int statusChoice = input.nextInt();
                String status = "";
                switch (statusChoice) {
                    case 1: status = Student.TahunPertama; break;
                    case 2: status = Student.TahunKedua; break;
                    case 3: status = Student.Junior; break;
                    case 4: status = Student.Senior; break;
                }
                person = new Student(name, address, phoneNumber, email, status);
                break;
            case 3:
                System.out.print("Masukkan kantor: ");
                String office = input.nextLine();
                System.out.print("Masukkan gaji: ");
                double salary = input.nextDouble();
                System.out.print("Masukkan tahun dipekerjakan: ");
                int year = input.nextInt();
                System.out.print("Masukkan bulan dipekerjakan: ");
                int month = input.nextInt();
                System.out.print("Masukkan hari dipekerjakan: ");
                int day = input.nextInt();
                MyDate dateHired = new MyDate(year, month, day);
                person = new Employee(name, address, phoneNumber, email, office, salary, dateHired);
                break;
            case 4:
                System.out.print("Masukkan kantor: ");
                office = input.nextLine();
                System.out.print("Masukkan gaji: ");
                salary = input.nextDouble();
                System.out.print("Masukkan tahun dipekerjakan: ");
                year = input.nextInt();
                System.out.print("Masukkan bulan dipekerjakan: ");
                month = input.nextInt();
                System.out.print("Masukkan hari dipekerjakan: ");
                day = input.nextInt();
                dateHired = new MyDate(year, month, day);
                input.nextLine(); // consume newline
                System.out.print("Masukkan jam kerja: ");
                String officeHours = input.nextLine();
                System.out.print("Masukkan pangkat: ");
                String rank = input.nextLine();
                person = new Faculty(name, address, phoneNumber, email, office, salary, dateHired, officeHours, rank);
                break;
            case 5:
                System.out.print("Masukkan kantor: ");
                office = input.nextLine();
                System.out.print("Masukkan gaji: ");
                salary = input.nextDouble();
                System.out.print("Masukkan tahun dipekerjakan: ");
                year = input.nextInt();
                System.out.print("Masukkan bulan dipekerjakan: ");
                month = input.nextInt();
                System.out.print("Masukkan hari dipekerjakan: ");
                day = input.nextInt();
                dateHired = new MyDate(year, month, day);
                input.nextLine(); // consume newline
                System.out.print("Masukkan gelar: ");
                String title = input.nextLine();
                person = new Staff(name, address, phoneNumber, email, office, salary, dateHired, title);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                System.exit(0);
        }

        // Menampilkan informasi objek yang dibuat
        System.out.println(person.toString());
    }
}
    