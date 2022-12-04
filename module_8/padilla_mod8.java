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

import java.util.InputMismatchException;
import java.util.Scanner;

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
    public static double yearlyService(double x) {
        return servFee + x;
    }    
    // 2 Parameters
    public static double yearlyService(double x , double y) {
        return servFee + x + y;        
    }
    // 3 Parameters
    public static double yearlyService(double x, double y, double z) {
        return servFee + x + y - z; 
    }
    
    // Print Prices
    public static void prices() {
        System.out.println("Your standard annual service fee is $" + servFee);
        System.out.println("Additional Services are available:\n$" + (int)oilChange +" Oil Change\n$" + (int)tireRot + " Tire Rotation");
        System.out.println("Get both for an additional discount\n");
    }

    // Test 1
    public static void testOne(){
        yearlyService();
        System.out.println("Package 1 includes an oil change. Total = $" + padilla_mod8.yearlyService(oilChange));
        System.out.println("Package 2 includes tire rotation. Total = $" + padilla_mod8.yearlyService(tireRot));
        System.out.println("Package 3 adds tire rotation. Total = $" + padilla_mod8.yearlyService(oilChange, tireRot));
        System.out.println("Package 4 adds a coupon. Total = $" + padilla_mod8.yearlyService(oilChange, tireRot, coupon));
        System.out.println("Enter \"0\" for no package.");
    }

    // Test 2
    public static void testTwo() {
        Scanner input = new Scanner(System.in);
        int test2 = 0;
        int testAns;
        System.out.println("\nWhich package would you like?");
        do {           
            try {
                testAns = input.nextInt();
                if (testAns >= 0 || testAns < 5) {
                    switch (testAns) {
                        case 0:
                            System.out.println("Your total is $" + (int)servFee);
                            test2++;
                            break;
                        case 1:
                            System.out.println("Your total is $" + (int)padilla_mod8.yearlyService(oilChange));
                            test2++;
                            break;
                        case 2:
                            System.out.println("Your total is $" + (int)padilla_mod8.yearlyService(tireRot));
                            test2++;
                            break;
                        case 3:
                            System.out.println("Your total is $" + (int)padilla_mod8.yearlyService(oilChange, tireRot));
                            test2++;
                            break;
                        case 4:
                            System.out.println("Your total is $" + (int)padilla_mod8.yearlyService(oilChange, tireRot, coupon));
                            test2++;
                            break;
                        default:
                            System.out.println("Please select a package or enter \"0\" for no package.");
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("We have encountered an error");
                break;
            }
        } while (test2 == 0);
        input.close();
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            // Welcome message
            System.out.println("\nHello and welcome to module 8!\nToday we will be using method overloading to find the cost of your yearly auto service visits\n");
            
            // Call yearlyService methods
            prices();
            testOne();
            testTwo();

            // Program Loop

            // Final Message
            System.out.println("\nThank you for trying this program! :)\n");

        input.close();
    } 
}
