package Lab.Lab_2;

public class Student extends Person {

    private String fNum;

    public Student() {
        super();
        this.fNum = "";
    }

    public Student(String name, String egn, String f) {
        super(name, egn);
        this.setfNum(f);
    }

    public String getfNum() {
        return this.fNum;
    }

    public void setfNum(String fNum) {
        this.fNum = fNum;
    }

}
