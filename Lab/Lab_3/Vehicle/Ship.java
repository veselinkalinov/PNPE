package Lab.Lab_3.Vehicle;

public class Ship extends Vehicle implements IsSeaVessel {
    private double deadweight;

    public Ship(double maxspeed, String model, double price, double deadweight) {
        super(maxspeed, model, price);
        this.deadweight = deadweight;
    }

    public double getDeadweight() {
        return deadweight;
    }

    public void setDeadweight(double deadweight) {
        this.deadweight = deadweight;
    }

    @Override
    public double checkPromo() {
        return getPrice() * 0.997;
    }

    @Override
    public void enterSea() {
        System.out.println("Korabat vleze v moreto.");
    }
}
