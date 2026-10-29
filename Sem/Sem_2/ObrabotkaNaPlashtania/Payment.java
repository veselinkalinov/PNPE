package Sem.Sem_2.ObrabotkaNaPlashtania;

public abstract class Payment implements Payable {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public void showAmount() {
        System.out.printf("Suma: %.2f eur.%n", amount);
    }

    public abstract void pay();
}
