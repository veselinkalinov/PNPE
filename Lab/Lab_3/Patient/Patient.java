import java.util.Scanner;

public abstract class Patient {
    protected static Scanner scanner = new Scanner(System.in);

    private String name;
    private String address;
    private String egn;

    public Patient() {
    }

    public Patient(String name, String address, String egn) {
        this.name = name;
        this.address = address;
        this.egn = egn;
    }

    public void input() {
        System.out.print("Ime: ");
        name = scanner.nextLine();

        System.out.print("Adres: ");
        address = scanner.nextLine();

        System.out.print("EGN: ");
        egn = scanner.nextLine();
    }

    public void output() {
        System.out.println("Ime: " + name);
        System.out.println("Adres: " + address);
        System.out.println("EGN: " + egn);
    }

    public abstract void cure();
}
