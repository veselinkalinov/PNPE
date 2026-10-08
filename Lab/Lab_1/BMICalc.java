package Lab.Lab_1;

import java.util.Scanner;

public class BMICalc {

    public static double getBMI(Scanner scanner) {
        System.out.print("Vuvedete vashata visochina v inchove: ");
        double height = scanner.nextDouble();

        System.out.print("Vuvedete vasheto teglo v paundi: ");
        double weight = scanner.nextDouble();

        double bmi = bmiFor(weight, height);

        return bmi;
    }

    public static double bmiFor(double weight, double height) {
        double bmi = weight * 703 / (height * height);

        return bmi;
    }

    public static String getStatus(double bmi) {
        if (bmi <= 18.5) {
            return "underweight";
        } else if (bmi <= 25) {
            return "normal";
        } else if (bmi <= 30) {
            return "overweight";
        } else {
            return "obese";
        }
    }

    public static void reportResults(int number, double bmi, String status) {
        double roundedBMI = Math.round(bmi * 100.0) / 100.0;

        System.out.println();
        System.out.println("=== BMI Results ===");
        System.out.println("Chovek nomer: " + number);
        System.out.printf("BMI: %.2f%n", roundedBMI);
        System.out.println("Status: " + status);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== BMI Calc ===");

        double bmi = getBMI(scanner);

        String status = getStatus(bmi);

        reportResults(1, bmi, status);

        scanner.close();
    }
}
