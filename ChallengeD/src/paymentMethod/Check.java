package paymentMethod;

public class Check extends PaymentMethod {
    private int number;
    private int bankid;
    private String holder;

    public Check(int id, int number, int bankid, String holder) {
        super(id);
        this.number = number;
        this.bankid = bankid;
        this.holder = holder;
    }

    public void Checkm(){
        System.out.println("check");

    }

    @Override
    public void authorize() {
        System.out.println("Se hace pago con cheque");
    }


}
