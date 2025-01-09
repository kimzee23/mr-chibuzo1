import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;



public class checkout {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

ArrayList<String> name = new ArrayList<>();
ArrayList<Double> price = new ArrayList<>();
ArrayList<Integer>  quantity = new ArrayList<>();

      System.out.println("Welcome to semicolon checkout store ");
      System.out.println("Enter costomer ID: ");
	String cos = input.nextLine();
 String name1;
 double price1;
 int quantity1;
 String addi;
LocalDate currentDate = LocalDate.now();

do{
      System.out.println("Enter product name:");
       name1 = input.nextLine();
      name.add(name1);

       System.out.println("Enter product price: $ ");
        price1 = input.nextDouble();
	price.add(price1);

       System.out.println("Enter the quantity:");
       quantity1 = input.nextInt();
	quantity.add(quantity1);

	System.out.println("Add more Item (Yes/No)");
	addi = input.nextLine();
	 addi = input.nextLine();
	

	
}while (addi.equalsIgnoreCase ("Yes"));
	

	if (addi.equalsIgnoreCase ("No")){
 System.out.println("Cashier Name: ");
	String cash = input.nextLine( );

System.out.println("How much discount he/she will get(%): ");
	double discountrate = input.nextInt();

double subTotal = 0;


double billTotal = 0;
 
double total = 0;






System.out.println("=======================================================");
System.out.println("SEMICOLON STORE");
       System.out.println("MAIN LAND BRANCH");
       System.out.println("LOCATION: 312, HARBART MACULAY WAY, SABO YABA, LAGOS.");
       System.out.println("Tel: 0329828342");
       System.out.println("Date:  "+ currentDate);
       System.out.println("Casher Name: " + cash);
       System.out.println("Input customer name");          
 System.out.println("===============================================================================");
       System.out.println("\t\t" +"ITEM" + "\t" + "\t" + "QTY"  + "\t\t" + "PRICE" + "\t\t"   + " TOTAL(NGN)");
System.out.println("---------------------------------------------------------------------------------");
  
for(int items = 0; items < name.size(); items++ ){
total = quantity.get(items) * price.get(items);
subTotal +=quantity.get(items) * price.get(items);
System.out.println("\t\t"+name.get(items)+ "\t\t"+ (quantity.get(items))+"\t\t" + (price.get(items)) + "\t\t\t"+ total);

}
System.out.println("---------------------------------------------------------------------------------");
double discount = discountrate / 100 * subTotal;


double vat = 17.50/100 * subTotal;

double realTotal = vat + subTotal - discount;

        
System.out.println("\t\t\t"+"Sub Total" + "\t\t"+subTotal);			 
System.out.println("\t\t\t"+ "Discount:" + "\t\t"+discount );
System.out.println("\t\t\t"+ "VAT @ 17.50%:" + "\t\t"+ vat );	

System.out.println("===============================================================================");
System.out.println("\t\t\t"+ "Bill Total: " + "\t\t\t" + realTotal );	

System.out.println("===============================================================================");
System.out.println("THIS IS NOT A RECEPIT KINDLY PAY:" + "\t\t\t" +realTotal);
System.out.println("===============================================================================");

System.out.println("How much did customer give to you?");
double amountGiven = input.nextInt();
if( amountGiven < realTotal ){
System.out.println("Invaild Input");
}else




System.out.println("=======================================================");
System.out.println("SEMICOLON STORE");
       System.out.println("MAIN LAND BRANCH");
       System.out.println("LOCATION: 312, HARBART MACULAY WAY, SABO YABA, LAGOS.");
       System.out.println("Tel: 0329828342");
       System.out.println("Date:  "+ currentDate);
       System.out.println("Casher Name: " + cash);
       System.out.println("Input customer name");          
 System.out.println("===============================================================================");
       System.out.println("\t\t" +"ITEM" + "\t" + "\t" + "QTY"  + "\t\t" + "PRICE" + "\t\t"   + " TOTAL(NGN)");
System.out.println("---------------------------------------------------------------------------------");
  
for(int items = 0; items < name.size(); items++ ){
total = quantity.get(items) * price.get(items);
subTotal +=quantity.get(items) * price.get(items);
System.out.println("\t\t"+name.get(items)+ "\t\t"+ (quantity.get(items))+"\t\t" + (price.get(items)) + "\t\t\t"+ total);
	

}
System.out.println("=================================================================================");
System.out.println("\t\t\t"+"Sub Total" + "\t\t"+subTotal);			 
System.out.println("\t\t\t"+ "Discount:" + "\t\t"+discount );
System.out.println("\t\t\t"+ "VAT @ 17.50%:" + "\t\t"+ vat );

System.out.println("=================================================================================");
double balance = amountGiven - realTotal;

 System.out.println("Bill Total:" + "\t\t\t" + realTotal);
 System.out.println("Amount paid:" + "\t\t\t" + amountGiven);
System.out.println("Balance" + "\t\t\t" + balance );

System.out.println("=================================================================================");
System.out.println("THANK YOU FOR YOUR PATRONAGE");
System.out.println("=================================================================================");
 




    
      	

}

 
    
    }
}
