package Sem.Sem_2.ObrabotkaNaPlashtania;

public class CardPayment extends Payment {
    public CardPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Plashtane s karta");
        showAmount();
    }
}
