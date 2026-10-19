public class Main {
    public static void main(String[] args) {
        Excursion excursion = new Excursion("Italiya", 7, 500, 3);
        Vacation vacation = new Vacation("Gartsiya", 5, 700, "Sun Beach");

        System.out.println("Ekskurzia do " + excursion.getDestination());
        System.out.println("Broi dni: " + excursion.getDays());
        System.out.println("Broi hoteli: " + excursion.getNumberOfHotels());
        System.out.println("Cena bez transport: " + excursion.getPrice());
        System.out.println("Kraina cena: " + excursion.fixPrice(excursion.getPrice()));
        System.out.println("Broi noshtuvki: " + excursion.countNights(excursion.getDays()));

        System.out.println();

        System.out.println("Pochivka v " + vacation.getDestination());
        System.out.println("Broi dni: " + vacation.getDays());
        System.out.println("Hotel: " + vacation.getHotelName());
        System.out.println("Cena bez transport: " + vacation.getPrice());
        System.out.println("Kraina cena: " + vacation.fixPrice(vacation.getPrice()));
    }
}
