package Lab.Lab_4;

class CourseException extends Exception {
    public CourseException(String message) {
        super(message);
    }
}

class CStudent {
    private String name;
    private String fn;
    private double[] scores;

    public CStudent(String name, String fn) {
        this.name = name;
        this.fn = fn;
        scores = new double[0];
    }

    public String getName() {
        return name;
    }

    public String getFn() {
        return fn;
    }

    public double[] getScores() {
        return scores;
    }

    public double getGrade() {
        if (scores.length == 0) {
            return 0;
        }

        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum / scores.length;
    }

    public void addScore(double grade) throws CourseException {
        if (grade < 2 || grade > 6) {
            throw new CourseException("Nevalidna ocenka!");
        }

        double[] newScores = new double[scores.length + 1];
        for (int i = 0; i < scores.length; i++) {
            newScores[i] = scores[i];
        }
        newScores[scores.length] = grade;
        scores = newScores;
    }
}

class CCourse {
    private String name;
    private CStudent[] student_list;
    private int count;

    public CCourse(String name) {
        this.name = name;
        student_list = new CStudent[30];
        count = 0;
    }

    public String getName() {
        return name;
    }

    private CStudent findStudent(String fn) throws CourseException {
        for (int i = 0; i < count; i++) {
            if (student_list[i].getFn().equals(fn)) {
                return student_list[i];
            }
        }
        throw new CourseException("Nqma student s tozi fakulteten nomer!");
    }

    public void addStudent(String name, String fn) throws CourseException {
        if (count == 30) {
            throw new CourseException("Kursut e pulen!");
        }
        for (int i = 0; i < count; i++) {
            if (student_list[i].getFn().equals(fn)) {
                throw new CourseException("Studentut veche e dobaven!");
            }
        }
        student_list[count] = new CStudent(name, fn);
        count++;
    }

    public void addScore(String fn, double grade) throws CourseException {
        findStudent(fn).addScore(grade);
    }

    public void addScores(String fn, double[] gradeList) throws CourseException {
        CStudent student = findStudent(fn);
        for (int i = 0; i < gradeList.length; i++) {
            student.addScore(gradeList[i]);
        }
    }

    public void displayScores() {
        System.out.println("Kurs: " + getName());
        for (int i = 0; i < count; i++) {
            CStudent student = student_list[i];
            System.out.print(student.getName() + " (FN: " + student.getFn() + ") - Ocenki: ");
            for (int j = 0; j < student.getScores().length; j++) {
                System.out.print(student.getScores()[j] + " ");
            }
            System.out.println("| Sreden uspeh: " + student.getGrade());
        }
    }
}

public class Zadacha1 {
    public static void main(String[] args) {
        try {
            CCourse course = new CCourse("Java");
            course.addStudent("Ivan", "12345");
            course.addStudent("Maria", "12346");

            course.addScore("12345", 5);
            course.addScores("12345", new double[] { 6, 4 });
            course.addScores("12346", new double[] { 5, 5.5, 6 });
            course.displayScores();
        } catch (CourseException e) {
            System.out.println(e.getMessage());
        }
    }
}
