package practice2.task7;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<String> items;
    private int discount;
    private String payMethod;

    private Order(OrderBuilder orderBuilder) {
        this.items = orderBuilder.items;
        this.discount = orderBuilder.discount;
        this.payMethod = orderBuilder.payMethod;
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
