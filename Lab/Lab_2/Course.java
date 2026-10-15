package Lab.Lab_2;

public class Course {
    private String name;
    private int hours;

    public Course(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }
}
