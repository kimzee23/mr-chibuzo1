import java.util.Scanner;
public class Kata{

public static void main(String[] args){

Scanner input = new Scanner (System.in);

//for the evenNumber

System.out.println("prompt the user to enter a even number : ");

int even = input.nextInt();

System.out.println("prompt the user to enter that is not even number");

int notEven = input.nextInt();

System.out.println(isEven(even));

System.out.println(isEven(notEven));

//for primeNumber

System.out.println("Prompt the user to enter a prime number");
int prime = input.nextInt();

System.out.println("Prompt the user to enter a prime number");
int notprime = input.nextInt();


System.out.println("----------------------------------------------------------------");

System.out.println(isprime(prime));
System.out.println(isprime(notprime));


// for sub

System.out.println(subtract(7,9));
System.out.println(subtract(9,10));

// for divide

System.out.println(divide(10, 5));
System.out.println(divide(10, 2));
System.out.println(divide(7, 3));

//  for factor

System.out.println("Prompt user to enter a factor");
	int fac1 = input.nextInt();

System.out.println("Prompt user to enter a factor");
	int fac2 = input.nextInt();

System.out.println("Prompt user to enter a factor");
	int fac3 = input.nextInt();

System.out.println("-------------------------------------------------------------");
System.out.println(factorof(fac1));
System.out.println(factorof(fac2));
System.out.println(factorof(fac3));

// for square

System.out.println("prompt the user to enter a even number : ");

int squ1= input.nextInt();

System.out.println("prompt the user to enter that is not even number");

int squ2= input.nextInt();
System.out.println("prompt the user to enter that is not even number");

int squ3= input.nextInt();

System.out.println("-------------------------------------------------------------------");

System.out.println(isSquare(squ1));

System.out.println(isSquare(squ2));


System.out.println(isSquare(squ3));


// for palindrome
System.out.println("prompt the user to enter a even number : ");

int pal1= input.nextInt();

System.out.println("prompt the user to enter that is not even number");

int pal2= input.nextInt();
System.out.println("prompt the user to enter that is not even number");

int pal3= input.nextInt();

System.out.println("------------------------------------------------------------------");

System.out.println(isPalindrome(pal1));

System.out.println(isPalindrome(pal2));


System.out.println(isPalindrome(pal3));


// for factorial

System.out.println("prompt the user to enter a even number : ");

int foc1= input.nextInt();

System.out.println("prompt the user to enter that is not even number");

int foc2= input.nextInt();
System.out.println("prompt the user to enter that is not even number");

int foc3= input.nextInt();

System.out.println("------------------------------------------------------------------");

System.out.println(factorialOf(foc1));

System.out.println(factorialOf(foc2));


System.out.println(factorialOf(foc3));

}
public static boolean isEven(int number){
	return number % 2 == 0;
}
public static boolean isprime(int number){
	if (number <= 1){

		return false;


}
	
for (int i = 2; i <= Math.sqrt(number); i++) {
	if (number % i == 0){
		return false;
}
}
return true;
}


public static int subtract(int a, int b){
	return Math.abs(a-b);

 	}
	 public static float divide(int numerator, int denominator){
		if (denominator == 0){
		
		return 0.0f; 
	}
return (float) numerator/ denominator;

int count = 0;
for(int i = 1; i <= number; i++){
	if (number % i == 0) {
		count++;
	}
    }
	return count;
    }
public static boolean isSquare(int number){
	if (number < 0){
	  return false;
}
int sqrt = (int) Math.sqrt(number);
	return sqrt * sqrt == number;
}
public static boolean isPalindrome(int number){
		String str = Integer.toString(number);
	return str.equals(new StringBuilder(str).reverse().toString());
	
	}
	public static int factorof(int number){
		if (number <= 0){
		return 0; 
	
	}
	int count = 0;
	for(int i = 1; i <= number; i++){
		if (number % i == 0) {
			count++;
		}
		
		}
		return count;
	}
		
	public static long factorialOf(int number){
			if (number < 0){
				throw new IllegalArgumentException("Factorial is not defined for negative numbers");
		
			}
			long factorial = 1;
			for (int i = 2; i <= number; i++){
				factorial *= i;
				}
				return factorial;
	
	}


}

