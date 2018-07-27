package paymentMethod;

import java.util.Date;

public class CreditCard extends PaymentMethod{
    private double number;
    private Date expDate;
    private int maxInstallements;
    private Issuer issuer;

    public CreditCard(int id, double number, Date expDate, int maxInstallements, Issuer issuer) {
        super(id);
        this.number = number;
        this.expDate = expDate;
        this.maxInstallements = maxInstallements;
        this.issuer = issuer;
    }

    @Override
    public void authorize() {
 System.out.println("Pago con creditCard");
    }
}
