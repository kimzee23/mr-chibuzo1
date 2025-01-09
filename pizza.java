import java.util.Scanner;
public class pizza {
   

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // the  Pizza details
        String[] pizzaTypes = {"Sapa size is 4 slices = 2500", "Small Money is 8 slices = 2900", "Big boys is 8 slices = 4000", "Odogwu is 12 slices = 5200", "kings size is 16 silces = 8200"};
        int[] slicesPerBox = {4, 6, 8, 12,16};
        int[] pricesPerBox = {2500, 2900, 4000, 5200,8200};


 System.out.println("Welcome to Iya Moses Pizza joint!\n");

        //  input

        System.out.print("Enter the number of guests: ");
        int numberOfGuests = input.nextInt();
        input.nextLine(); // Consume the newline

        System.out.println("Choose the type of pizza:");
        for (int i = 0; i < pizzaTypes.length; i++) {
            System.out.println((i + 1) + ". " + pizzaTypes[i]);
        }

        System.out.print("Enter the number  to the pizza type: ");
        int pizzaChoice = input.nextInt() - 1;

        while (pizzaChoice < 0 || pizzaChoice >= pizzaTypes.length) {
        System.out.println("Invalid pizza choice. Please Re-enter right number of pizza");
	pizzaChoice = input.nextInt() - 1;
            
        }

        // Calculations
        int slicesPerGuest = 1; // Each guest eats 1 slice each
        int totalSlicesNeeded = numberOfGuests * slicesPerGuest;
        int slicesPerBoxChosen = slicesPerBox[pizzaChoice];
        int pricePerBoxChosen = pricesPerBox[pizzaChoice];

        int boxesNeeded = (int) Math.ceil((double) totalSlicesNeeded / slicesPerBoxChosen);
        int totalSlices = boxesNeeded * slicesPerBoxChosen;
        int leftoverSlices = totalSlices - totalSlicesNeeded;
        int totalPrice = boxesNeeded * pricePerBoxChosen;

        // Output
        System.out.println("\nOrder Summary:");
        System.out.println("Number of boxes of pizza to buy: " + boxesNeeded + " box(es)");
        System.out.println("Number of leftover slices: " + leftoverSlices + " slice(s)");
        System.out.println("Total price: N" + totalPrice);

       
    }
}

/*1.Prompt the user to enter the number of people that want to get pizza
2.Collect the number of the people 
3.store the number  as guests 
4.list the number of pizza available 
5.Let the guest the user choose one
6.collect the type of pizza the user choose 
7.store the pizza that was choose my the user
8.Calculate the number of boxes required
9.collect and store
10.Calculate the number of leftover  slices.
11.Calculate total price in Naira.*/


    
