import java.util.Scanner;
import java.time.LocalDateTime;
public class Gas {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int totalMiles = 0;
int totalGallons = 0;
int counter =  0;
for (counter += 1; counter <= 10; counter++){

System.out.println("Enter miles:");
int m1 = input.nextInt();

System.out.println("Enter gallons");
int g1 = input.nextInt();           
if (gallons != 0){
int mPg = m1 / g1;   
System.out.print("The miles per gallon is:" + mPg);
}else{
System.out.print("Gallon can not be zero");
}
 
while (m1 <= 10 && g1 <= 10){ counter +=1;
System.out.print("Total amount of mile & gallons"+m1+" "+g1);
m1++;
g1++;
counter++;
}     
System.out.println("---\nwhat a beatiful world---");      
}

              }
}