package practice2.task7;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final List<String> items;
    private int discount;
    private String payMethod;

    private Order(OrderBuilder orderBuilder) {
        this.items = List.copyOf(orderBuilder.items);
        this.discount = orderBuilder.discount;
        this.payMethod = orderBuilder.payMethod;
    }

    public List<String> getItems() {
        return items;
    }

    public int getDiscount() {
        return discount;
    }

    public String getPayMethod() {
        return payMethod;
    }

    @Override
    public String toString() {
        return "Order{" +
                "items=" + items +
                ", discount=" + discount + "%" +
                ", payMethod='" + payMethod + '\'' +
                '}';
    }

    static class OrderBuilder {

        private List<String> items = new ArrayList<>();
        private int discount;
        private String payMethod;

        public OrderBuilder addItem(String item) {
            items.add(item);
            return this;
        }

        public OrderBuilder setDiscount(int discount) {
            this.discount = discount;
            return this;
        }

        public OrderBuilder setPayMethod(String payMethod) {
            this.payMethod = payMethod;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
