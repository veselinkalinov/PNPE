public class Hovercraft extends Vehicle implements IsLandVehicle, IsSeaVessel {
    private int passengers;

    public Hovercraft(double maxspeed, String model, double price, int passengers) {
        super(maxspeed, model, price);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public double checkPromo() {
        return getPrice() * 0.97;
    }

    @Override
    public void enterLand() {
        System.out.println("Hovercraft vleze na susha.");
    }

    @Override
    public void enterSea() {
        System.out.println("Hovercraft vleze v moreto.");
    }
}
