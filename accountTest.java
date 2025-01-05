import java.util.Scanner;

public class accountTes{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

Account myAccount = new Account();

System.out.printf("Initial name is: %s%n%n", myAccount.getName());

System.out.println("Enter your account name:");

String theName = input.nextLine();

myAccount.setName(theName);

System.out.println();

System.out.printf("Name in object myAccount is : %n%s%n", myAccount.getName());

System.out.println("Enter your account number");
long theNumber = input.nextLong();

System.out.println();


System.out.println(theName + " your account number is  " + theNumber + "  welcome to FCMB, My bank and I  ");



}




}