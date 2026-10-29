package Sem.Sem_2.ObrabotkaNaPlashtania;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        try {
            Payable payment = PaymentFactory.createPayment(type, amount);
            Order order = new Order(payment);
            order.checkout();
        } catch (IllegalArgumentException err) {
            System.out.println(err.getMessage());
        }
        scanner.close();
    }
}
