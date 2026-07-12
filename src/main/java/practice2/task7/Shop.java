package practice2.task7;

public class Shop {

    public Order createOrder() {
        return new Order.OrderBuilder()
                .addItem("Laptop")
                .addItem("Mouse")
                .addItem("Keyboard")
                .setDiscount(10)
                .setPayMethod("Credit Card")
                .build();
    }
}
