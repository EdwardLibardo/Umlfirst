package shoppingCart;

public class LineItem {
    private int quantity;
    private double price;
    private Product product;

    public LineItem(int quantity, double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public Product getProduct() {
        return product;
    }


    public String items(){

        return "Quantity " +  quantity + " Price " + price + " product " + product.getName();

        //System.out.println("First customer's username " + userName);
        //System.out.println("First customer's password " + password);

    }

}
