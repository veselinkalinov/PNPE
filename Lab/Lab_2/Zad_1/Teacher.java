package Lab.Lab_2.Zad_1;

import Lab.Lab_2.Course;

public class Teacher extends Person {
    private Course course1;
    private Course course2;
    private int experience;

    public Teacher(String name, int age, Course course1, Course course2, int experience) {
        super(name, age);
        this.course1 = course1;
        this.course2 = course2;
        this.experience = experience;
    }

    public void setCourse1(Course course1) {
        this.course1 = course1;
    }

    public Course getCourse1() {
        return course1;
    }

    public void setCourse2(Course course2) {
        this.course2 = course2;
    }

    public Course getCourse2() {
        return course2;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
}
