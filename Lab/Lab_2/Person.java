package Lab.Lab_2;

public class Person {
    private String name;
    private String egn;

    public Person(String n, String e) {
        this.name = n;
        this.egn = e;
    }

    public Person() {
        this.name = "";
        this.egn = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String e) {
        this.egn = e;
    }

    public void sayHi() {
        System.out.println("Hi, my name is " + name);
    }

    public static void sayHello() {
        System.out.println("Hello");
    }

}
