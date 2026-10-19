public class Vacation extends Journey {
    private String hotelName;

    public Vacation(String destination, int days, double price, String hotelName) {
        super(destination, days, price);
        this.hotelName = hotelName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    @Override
    public double fixPrice(double price) {
        return price + price * 40 / 100;
    }
}
