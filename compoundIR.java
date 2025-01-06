import java.util.Scanner;
import java.time.LocalDate;



public class compundIR {
public static void main(String[]gaz){
Scanner input = new Scanner(System.in);
LocalDate currentTime = LocalDate.now();
System.out.println("Date"+ currentTime);
float p,r,t,n;
System.out.println("Enter the amount of money you have available to invest initailly:");
double principla = input.nextInt();
//---------------------------------------
System.out.println("Enter Annual nonmial rate:");
double rateDecimal  = input.nextFloat();
//---------------------------------------
System.out.println("Enter the investment duration:");
double timeYears = input.nextFloat();
//---------------------------------------
System.out.println("Enter per unoit of time:");
double unit = input.nextFloat();

double amount = principla * Math.pow(1 + (rateDecimal/unit), unit * timeYears);
double cinterest = amount - principla;
System.out.println("Compund interst after "+ timeYears + "year:"+ cinterest);
System.out.println("Amount after:" + timeYears +"years:" + amount );

}
}
