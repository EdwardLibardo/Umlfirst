package paymentMethod;

import java.util.Date;

public class DebitCard extends PaymentMethod {

    private double number;
    private Date expDate;
    private Issuer issuer;


    public DebitCard(int id, double number, Date expDate, Issuer issuer) {
        super(id);
        this.number = number;
        this.expDate = expDate;
        this.issuer = issuer;
    }

    @Override
    public void authorize() {
        System.out.println("Debit card");

    }

}
