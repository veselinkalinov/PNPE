package Sem.Sem_2.ObrabotkaNaPlashtania;

public class PaymentFactory {
    public static Payable createPayment(String type, double amount) {
        if (type.equals("card")) {
            return new CardPayment(amount);
        } else if (type.equals("cash")) {
            return new CashPayment(amount);
        } else {
            throw new IllegalArgumentException("Nevaliden tip plashtane!");
        }
    }
}
