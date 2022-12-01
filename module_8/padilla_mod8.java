/*
Luis Padilla
12/1/22
CSD320 Module 8 Assignment

Write a program with four methods for calculating the cost of a yearly auto service visit.
The methods will be titled yearlyService.

yearlyService(no parameters) - Will return the standard service charge.
yearlyService(one parameter) - Will return the standard service charge with an added oil change fee.
yearlyService(two parameters) - Will return the standard service charge with an added oil change fee and a tire rotation charge.
yearlyService(three parameters) - Will return the standard service charge with an added oil change fee, a tire rotation charge, along with a coupon amount that will be deducted from the total cost.

Write a main method that will test each of these methods two times.

*/


package module_8;

public class padilla_mod8 {
    
    // No parameters
    static void yearlyService() {
        System.out.println("\nYour yearly auto service costs you $200 per year\n");
    }
    
    // 1 Parameter
    static int yearlyService(int x) {
        return x;
    }
    
    // 2 Parameters
    static float yearlyService(float x, float y) {
        return x + y;        
    }

    // 3 Parameters
    static double yearlyService(double x, double y, double z) {
        return x + y + z; 
    }
    
    // Main method
    public static void main(String[] args) {

        // Welcome message
        System.out.println("\nHello and welcome to module 8!\nToday we will be using method overloading to find the cost of your yearly auto service visits\n");
        System.out.println("");

        // Call yearlyService methods
        yearlyService();

    }
}
