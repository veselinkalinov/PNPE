package Lab.Lab_2.Zad_1;

import Lab.Lab_2.Course;

public class Test {
    public static void main(String[] args) {
        Course c1 = new Course("Java", 60);
        Course c2 = new Course("Matematika", 90);

        Teacher t = new Teacher("Ivan", 45, c1, c2, 12);

        System.out.println("Ime: " + t.getName());
        System.out.println("Vazrast: " + t.getAge());
        System.out.println("Kurs 1: " + t.getCourse1().getName());
        System.out.println("Kurs 2: " + t.getCourse2().getName());
        System.out.println("Stazh: " + t.getExperience());

        t.setExperience(13);
        System.out.println("Nov stazh: " + t.getExperience());
    }
}
