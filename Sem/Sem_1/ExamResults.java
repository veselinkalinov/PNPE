package Sem.Sem_1;

import java.util.Scanner;

public class ExamResults {

    public static void readResults(String[] fn, int[] grades, Scanner scanner) {
        System.out.println("Vuvedete fakulteten nomer i ocenka:");

        for (int i = 0; i < grades.length; i++) {
            fn[i] = scanner.next();
            grades[i] = scanner.nextInt();
        }
    }

    public static void printResults(String[] fn, int[] grades) {
        System.out.println("\nRezultati ot izpita:");

        for (int i = 0; i < grades.length; i++) {
            System.out.println("FN: " + fn[i] + ", ocenka: " + grades[i]);
        }
    }

    public static int countFailedStudents(int[] grades) {
        int count = 0;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 2) {
                count++;
            }
        }
        return count;
    }

    public static void printFailedStudents(String[] fn, int[] grades) {
        System.out.print("Skusani studenti: ");

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 2) {
                System.out.print(fn[i] + " ");
            }
        }
        System.out.println();
    }

    public static double calculateAverageGrade(int[] grades) {
        int sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return (double) sum / grades.length;
    }

    public static void printTopStudents(String[] fn, int[] grades) {
        int max = grades[0];

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }

        System.out.println("Nai-visoka ocenka: " + max);
        System.out.print("Nai-dobri studenti: ");

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == max) {
                System.out.print(fn[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Broi studenti: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Nevaliden broi studenti!");
            scanner.close();
            return;
        }

        String[] fn = new String[n];
        int[] grades = new int[n];

        readResults(fn, grades, scanner);
        printResults(fn, grades);

        System.out.println("Broi skusani: " + countFailedStudents(grades));
        printFailedStudents(fn, grades);
        System.out.println("Sreden uspeh: " + calculateAverageGrade(grades));
        printTopStudents(fn, grades);

        scanner.close();
    }
}
