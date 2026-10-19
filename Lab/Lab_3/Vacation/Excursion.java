public class Excursion extends Journey implements NumberOfNights {
    private int numberOfHotels;

    public Excursion(String destination, int days, double price, int numberOfHotels) {
        super(destination, days, price);
        this.numberOfHotels = numberOfHotels;
    }

    public int getNumberOfHotels() {
        return numberOfHotels;
    }

    public void setNumberOfHotels(int numberOfHotels) {
        this.numberOfHotels = numberOfHotels;
    }

    @Override
    public double fixPrice(double price) {
        return price + price * 10 / 100;
    }

    @Override
    public int countNights(int days) {
        if (days <= 2) {
            return 0;
        }

        return days - 2;
    }
}
