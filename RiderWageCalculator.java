public class RiderWageCalculator{
 
    public static int calculateWage(int successfulDeliveries) {
        int basePay = 5000;
        int wagePerParcel;

        if (successfulDeliveries < 40) {
            wagePerParcel = 160;
        } else if (successfulDeliveries < 60) {
            wagePerParcel = 250;
        } else if (successfulDeliveries < 70) {
            wagePerParcel = 700;
        } else {
            wagePerParcel = 600;
        }

        return basePay + (wagePerParcel * successfulDeliveries);
    }

    public static void main(String[] args) {
        System.out.println(calculateWage(80)); //  45000
        System.out.println(calculateWage(25)); //  9000
        System.out.println();
        System.out.println("2025 our year of up lifting ");

    }



}
