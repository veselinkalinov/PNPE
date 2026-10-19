public class Car extends Vehicle implements IsLandVehicle {
    private double kW;

    public Car(double maxspeed, String model, double price, double kW) {
        super(maxspeed, model, price);
        this.kW = kW;
    }

    public double getKW() {
        return kW;
    }

    public void setKW(double kW) {
        this.kW = kW;
    }

    @Override
    public double checkPromo() {
        return getPrice() * 0.80;
    }

    @Override
    public void enterLand() {
        System.out.println("Kolata vleze na susha.");
    }
}
