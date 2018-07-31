import javax.naming.Name;

public class Customer {
    private int id;
    private String name;
    private int contact;
    private String userName;
    private String password;

    public Customer() {
        this.id = id;
        this.name = name;
        this.contact =contact;
        this.userName = userName;
        this.password = password;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    void CustomerDates1 () {
       // System.out.println("\n\t\tThis is the Edward's account");
        System.out.println("First customer's id " + id);
        System.out.println("First customer's name " + name);
        System.out.println("First customer's contact " + contact);
        System.out.println("First customer's username " + userName);
        System.out.println("First customer's password " + password);

    }
    void CustomerDates2 () {
        // System.out.println("\n\t\tThis is the Edward's account");
        System.out.println("Second customer's id " + id);
        System.out.println("Second customer's name " + name);
        System.out.println("Second customer's contact " + contact);
        System.out.println("Second customer's username " + userName);
        System.out.println("Second customer's password " + password);

    }

}

