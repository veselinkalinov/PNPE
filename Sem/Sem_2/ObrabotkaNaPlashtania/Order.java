package Sem.Sem_2.ObrabotkaNaPlashtania;

public class Order {
    private Payable payment;

    public Order(Payable payment) {
        this.payment = payment;
    }

    public void checkout() {
        payment.pay();
    }
}
