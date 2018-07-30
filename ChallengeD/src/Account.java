import paymentMethod.PaymentMethod;
import shoppingCart.ShoppingCart;

import java.util.List;


public class Account {


    private int id;
    private Customer customer;
    private ShoppingCart cart;
    private AccountStatus status;
    private List <PaymentMethod> methods;
    private List<Address> addresses;

    public Account(Customer customer) {
        this.id = id;
        this.customer = this.customer;
        this.cart = cart;
        this.status = status;
        this.methods = methods;
        this.addresses = addresses;
    }

    public List<PaymentMethod> getMethod() { return methods; }

    public void setMethod(List<PaymentMethod> method) { this.methods = method; }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public List<PaymentMethod> getMethods() {
        return methods;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void addMethod(PaymentMethod p) {
        methods.add(p);
    }

    public void addAddress(Address a) {
        addresses.add(a);
    }
    public void destroyMethods() { methods.clear();}
    public void destroyAddresses() { addresses.clear(); }
}

