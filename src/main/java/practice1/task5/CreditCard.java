package practice1.task5;

public class CreditCard implements PaymentMethod{
    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата кредитной картой на сумму " + amount);
    }
}
