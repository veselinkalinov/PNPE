package Lab.Lab_3.Vehicle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(220, "BMW", 50000, 150);
        Hovercraft hovercraft = new Hovercraft(100, "HC-1", 120000, 20);
        Ship ship = new Ship(45, "Titan", 3000000, 50000);

        System.out.println("Kola: " + car.getModel());
        System.out.println("Max skorost: " + car.getMaxspeed());
        System.out.println("Moshtnost: " + car.getKW() + " kW");
        System.out.println("Cena: " + car.getPrice());
        System.out.println("Promocionalna cena: " + car.checkPromo());
        car.enterLand();

        System.out.println();
        System.out.println("Hovercraft: " + hovercraft.getModel());
        System.out.println("Max skorost: " + hovercraft.getMaxspeed());
        System.out.println("Patnici: " + hovercraft.getPassengers());
        System.out.println("Cena: " + hovercraft.getPrice());
        System.out.println("Promocionalna cena: " + hovercraft.checkPromo());
        hovercraft.enterLand();
        hovercraft.enterSea();

        System.out.println();
        System.out.println("Korab: " + ship.getModel());
        System.out.println("Max skorost: " + ship.getMaxspeed());
        System.out.println("Dedueit: " + ship.getDeadweight());
        System.out.println("Cena: " + ship.getPrice());
        System.out.println("Promocionalna cena: " + ship.checkPromo());
        ship.enterSea();
    }
}
