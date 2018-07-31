package shoppingCart;

import shoppingCart.LineItem;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    private Date modified;
    private OrderStatus status;
    private String shippingAdress;
    private double total;
    private List<LineItem> Items;

    public Order(int id, Date modified, OrderStatus status, String shippingAdress, double total, List<LineItem> items) {
        this.id = id;
        this.modified = modified;
        this.status = status;
        this.shippingAdress = shippingAdress;
        this.total = total;
        Items = items;
    }

    public int getId() {
        return id;
    }

    public Date getModified() {
        return modified;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public String getShippingAdress() {
        return shippingAdress;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setShippingAdress(String shippingAdress) {
        this.shippingAdress = shippingAdress;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setItems(List<LineItem> items) {
        Items = items;
    }

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
