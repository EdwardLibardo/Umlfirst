import java.util.*;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {

        //Customer
        System.out.println("Insert the customer´s number to find dates");
        int input;
        Scanner inputscanner = new Scanner(System.in);
        input = Integer.parseInt(inputscanner.nextLine());
        System.out.println("You wrote "+ input);
        if (1 == input) {
            Customer FirstCustomer = new Customer();
            FirstCustomer.setId(122);
            FirstCustomer.setName("Edward");
            FirstCustomer.setContact(3232);
            FirstCustomer.setUserName("corregidor");
            FirstCustomer.setPassword("ollal");
            FirstCustomer.CustomerDates1();
        }
        else if (2==input)
        {
            Customer FirstCustomer = new Customer();
            FirstCustomer.setId(122);
            FirstCustomer.setName("Billy");
            FirstCustomer.setContact(3236);
            FirstCustomer.setUserName("Mandy");
            FirstCustomer.setPassword("1231");
            FirstCustomer.CustomerDates1();
        }
        else {System.out.println("There are not more options");}


    }

}
