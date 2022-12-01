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
    
    // Declaring variables
    public static final double servFee = 200;
    public static final double oilChange = 75;
    public static final double tireRot = 50;
    public static final double coupon = 25;
    
    // No parameters
    public static void yearlyService() {
        System.out.println("Your yearly auto service is " + servFee);
    }
    // 1 Parameter
    public static double yearlyService(double oilChange) {
        return servFee + oilChange;
    }    
    // 2 Parameters
    public static double yearlyService(double oilChange , double tireRot) {
        return servFee + oilChange + tireRot;        
    }
    // 3 Parameters
    public static double yearlyService(double oilChange, double tireRot, double coupon) {
        return servFee + oilChange + tireRot - coupon; 
    }
    
    // Main method
    public static void main(String[] args) {

        // Welcome message
        System.out.println("\nHello and welcome to module 8!\nToday we will be using method overloading to find the cost of your yearly auto service visits\n");
        //System.out.println("");

        // Call yearlyService methods
        yearlyService();
        System.out.println("1 param = " + padilla_mod8.yearlyService(oilChange));
        System.out.println("2 param = " + padilla_mod8.yearlyService(oilChange, tireRot));
        System.out.println("3 param = " + padilla_mod8.yearlyService(oilChange, tireRot, coupon));

    }
}
