package shoppingCart;

import shoppingCart.LineItem;

import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    private Date modified;
    private OrderStatus status;
    private String shippingAdress;
    private double total;
    private List<LineItem> Items;

    public List<LineItem> getItems() {
        return Items;
    }

    public void addItem(LineItem i) {
        Items.add(i);
    }

    public double getTotal() {
        double total = 0.0;

        for (int i = 0; i < Items.size(); i++) {
            total  += Items.get(i).getQuantity() * Items.get(i).getPrice();
        }
        return total;
    }
}
