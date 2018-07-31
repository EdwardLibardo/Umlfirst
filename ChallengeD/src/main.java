import shoppingCart.LineItem;
import shoppingCart.OrderStatus;
import shoppingCart.Product;
import shoppingCart.Order;

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


            List<LineItem> list1=new ArrayList<LineItem>();
            list1.add(new LineItem(1,20,new Product("Car","Optimus","This is blue and red")));
            list1.add(new LineItem(2,21,new Product("Bike","Megatron","This is gray ")));
            list1.add(new LineItem(2,21,new Product("Airplane","Bumblebee","This is yellow ")));

            Calendar day=new GregorianCalendar();
            Date date=day.getTime();
            Order Or=new Order(3,date,OrderStatus.CLOSED, "St 25 #45",0,list1);
            for (int i = 0; i<list1.size();i++){
                System.out.println(list1.get(i).items());
            }


            System.out.println("El total de la compra es:"+Or.getTotal());

            //int i=Or.getId();
            //System.out.println(Or.getItems().get(i));
        }
        else if (2==input)
        {
            Customer FirstCustomer = new Customer();
            FirstCustomer.setId(122);
            FirstCustomer.setName("Billy");
            FirstCustomer.setContact(3236);
            FirstCustomer.setUserName("Mandy");
            FirstCustomer.setPassword("1231");
            FirstCustomer.CustomerDates2();

            List<LineItem> list2=new ArrayList<LineItem>();
            list2.add(new LineItem(1,20,new Product("Jeans","hshs","This is blue and red")));
            list2.add(new LineItem(2,21,new Product("Shoes","Mhjshjdsn","This is gray ")));
            list2.add(new LineItem(2,21,new Product("Hat","Bhdhd","This is yellow ")));

            Calendar day=new GregorianCalendar();
            Date date=day.getTime();
            Order Or=new Order(6,date,OrderStatus.SHIPPED, "St 55 #23",0,list2);

            for (int i = 0; i<list2.size();i++){
                System.out.println(list2.get(i).items());
            }


            System.out.println("El total de la compra es:"+Or.getTotal());
        }
        else {System.out.println("There are not more options");}


        System.out.println(new Address(1,"Hola","chao","Bogota","Colombia",true).getAddress());
    }

}
