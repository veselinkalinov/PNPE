package Lab.Lab_1;

import java.util.Scanner;

public class CVGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Generator na CV ===");
        System.out.println("Molya, vuvedete vashite danni:");
        System.out.println();

        System.out.print("Ime i familiya: ");
        String name = scanner.nextLine();

        System.out.print("Vuzrast: ");
        String age = scanner.nextLine();

        System.out.print("Grad: ");
        String city = scanner.nextLine();

        System.out.print("Telefon: ");
        String phone = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Obrazovanie: ");
        String education = scanner.nextLine();

        System.out.print("Specialnost: ");
        String specialty = scanner.nextLine();

        System.out.print("Trudov opit: ");
        String experience = scanner.nextLine();

        System.out.print("Umeniya: ");
        String skills = scanner.nextLine();

        System.out.print("Chujdi ezici: ");
        String languages = scanner.nextLine();

        System.out.print("Hobita i interesi: ");
        String hobbies = scanner.nextLine();

        System.out.println();
        System.out.println("================================");
        System.out.println("          CV");
        System.out.println("================================");

        System.out.println("LICHNA INFORMACIYA");
        System.out.println("Ime: " + name);
        System.out.println("Vuzrast: " + age);
        System.out.println("Grad: " + city);
        System.out.println("Telefon: " + phone);
        System.out.println("Email: " + email);

        System.out.println();
        System.out.println("OBRAZOVANIE");
        System.out.println("Uchebno zavedenie: " + education);
        System.out.println("Specialnost: " + specialty);

        System.out.println();
        System.out.println("TRUDOV OPIT");
        System.out.println(experience);

        System.out.println();
        System.out.println("UMENIYA");
        System.out.println(skills);

        System.out.println();
        System.out.println("CHUJDI EZICI");
        System.out.println(languages);

        System.out.println();
        System.out.println("HOBITA I INTERESI");
        System.out.println(hobbies);

        System.out.println();
        System.out.println("================================");
        System.out.println("CV-to e generirano uspeshno!");

        scanner.close();
    }
}
