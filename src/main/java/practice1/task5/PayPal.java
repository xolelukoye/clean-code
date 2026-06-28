package practice1.task5;

public class PayPal implements PaymentMethod{

    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата через PayPal на сумму " + amount);
    }
}
