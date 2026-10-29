package Lab.Lab_4;

import java.util.Scanner;

class BuildingException extends Exception {
    public BuildingException(String message) {
        super(message);
    }
}

class Building {
    private int height;
    private double area;
    private String address;

    public Building() {
    }

    public Building(int height, double area, String address) throws BuildingException {
        setHeight(height);
        setArea(area);
        setAddress(address);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) throws BuildingException {
        if (height <= 0) {
            throw new BuildingException("Nevalidna visochina!");
        }
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) throws BuildingException {
        if (area <= 0) {
            throw new BuildingException("Nevalidna plosht!");
        }
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void input(Scanner scanner) throws BuildingException {
        System.out.print("Visochina (m): ");
        setHeight(Integer.parseInt(scanner.nextLine()));
        System.out.print("Plosht (kv.m): ");
        setArea(Double.parseDouble(scanner.nextLine()));
        System.out.print("Adres: ");
        setAddress(scanner.nextLine());
    }

    public void print() {
        System.out.println("Visochina: " + height + " m");
        System.out.println("Plosht: " + area + " kv.m");
        System.out.println("Adres: " + address);
    }
}

class House extends Building {
    private int floors;
    private String owner;

    public House() {
    }

    public House(int height, double area, String address, int floors, String owner)
            throws BuildingException {
        super(height, area, address);
        setFloors(floors);
        setOwner(owner);
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) throws BuildingException {
        if (floors <= 0) {
            throw new BuildingException("Nevaliden broi etaji!");
        }
        this.floors = floors;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void input(Scanner scanner) throws BuildingException {
        super.input(scanner);
        System.out.print("Broi etaji: ");
        setFloors(Integer.parseInt(scanner.nextLine()));
        System.out.print("Sobstvenik: ");
        setOwner(scanner.nextLine());
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Etaji: " + floors);
        System.out.println("Sobstvenik: " + owner);
    }

    public double averageHeight() {
        return (double) getHeight() / floors;
    }

    public static House findMostSpacious(House[] houses) throws BuildingException {
        if (houses.length == 0) {
            throw new BuildingException("Nqma kushti!");
        }
        House best = houses[0];
        for (int i = 1; i < houses.length; i++) {
            if (houses[i].averageHeight() > best.averageHeight()) {
                best = houses[i];
            }
        }
        return best;
    }
}

public class Zadacha4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Broi kushti: ");
            int n = Integer.parseInt(scanner.nextLine());
            if (n <= 0) {
                throw new BuildingException("Broqt kushti trqbva da e polojitelen!");
            }
            House[] houses = new House[n];

            for (int i = 0; i < n; i++) {
                System.out.println("\nKushta " + (i + 1) + ":");
                houses[i] = new House();
                houses[i].input(scanner);
            }

            System.out.println("\nVsichki kushti:");
            for (int i = 0; i < n; i++) {
                houses[i].print();
                System.out.println();
            }

            House best = House.findMostSpacious(houses);
            System.out.println("Nai-prostornata kushta:");
            best.print();

            System.out.println();

            System.out.println("Sredna visochina na etaj: " + best.averageHeight() + " m");
        } catch (BuildingException e) {
            System.out.println(e.getMessage());
        }
    }
}
