import java.util.Scanner;
import java.time.LocalDate;

import java.util.ArrayList;

 class product{
    String name;
    double price;
    int quantity;

    public product (String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
 } 
public double calculateTotal(){
    return price * quantity;
} 
}
public class checkout {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      System.out.println("Welcome to semicolon checkout store ");
      
      System.out.println("Enter product name:");
      String name = input.nextLine();

       System.out.println("Enter product price");
       double price = input.nextDouble();

       System.out.println("Enter the quantity:");
       int quantity = input.nextInt();

       product product = new product(name, price, quantity);

       double total = product.calculateTotal();
       double vat = total * 0.075;
       double grandTotal = total + vat;

       LocalDate currentDate = LocalDate.now();
       


       //output
       System.out.println("\n---- Checkout inovie-------");
       System.out.println("SEMICOLON STORE");
       System.out.println("MAIN LAND BRANCH");
       System.out.println("LOCATION: 312, HARBART MACULAY WAY, SABO YABA, LAGOS.");
       System.out.println("Tel: 0329828342");
       System.out.println("Date:  "+ currentDate);
       System.out.println("Casher Name: Chiman");
       System.out.println("Input customer name");
       String cusname = input.nextLine();
       System.out.println("Customer name:" + cusname);
       System.out.println("\n=======================================================");
       System.out.println("\t ITEM        PRICE     TOTAL(NGN)");
       System.out.println("\t  " + name   +       "\t     "+  price +   "\t" +total );
       System.out.println("\n-------------------------------------------------------");
       System.out.println("\n product:" + product.name);
       System.out.println("\n price:" + product.price);
       System.out.println("\n uantity:" + product.quantity);
       System.out.println("\n Total:" + total);
       System.out.println("\n vat 7.5:" + vat);
       System.out.println("\n========================================================"); 
       System.out.println("\n Bill total:" + grandTotal);
       System.out.println("\n========================================================"); 
    System.out.println("\n Thank you for shopping @ semicolon Store!");
    System.out.println("\n-------------------------------------------------------");
    System.out.println("\n ---------------Season Greetings------------------------");

    }
}
