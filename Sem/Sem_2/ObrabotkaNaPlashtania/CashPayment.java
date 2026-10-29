package Sem.Sem_2.ObrabotkaNaPlashtania;

public class CashPayment extends Payment {
    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Plashtane v broi");
        showAmount();
    }
}
