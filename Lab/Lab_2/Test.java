package Lab.Lab_2;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Ivan");
        System.out.println(p1.getName());
        Person p2 = new Person("Georgi", "060321123");
        System.out.println(p2.getName());
        Person.sayHello();
        p1.sayHi();
        p2.sayHi();

        Student s = new Student("Iva", "061231123", "121223123");
        System.out.println(s.getName());
        s.sayHi();

        Course c1 = new Course("Java", 10);
        Course c2 = new Course("Math", 13);

        c2.setName("Databases");

        System.out.println(c1.getName());
        System.out.println(c2.getName());

    }
}
