/*
 Luis Padilla
 11/7/22
 CSD320 Module 5 Assigment

Write a program that uses a while loop to display the following math operations 
both in the smaller to larger order and then the larger to smaller order 
with the denominator being 3 through 99.
Ensure your application displays the mathematical results.
1/3.0 + 1/5.0 + 1/7.0 + ··· + 1/95.0 + 1/97.0 + 1/99.0
1/99.0 + 1/97.0 + 1/95.0 + ··· + 1/7.0 + 1/5.0 + 1/3.0
*/

package module_5;

import java.util.Scanner;

public class padilla_mod5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // Welcome Message
            System.out.println("Hello and Welcome to Module 5!\nWe will use a loop to display 2 math operations.\nOne will be displayed in smaller to larger and the other from larger to smaller!");
            
            // First equation
            System.out.println("\nThe first equation is:\n1/3.0 + 1/5.0 + 1/7.0 + ··· + 1/95.0 + 1/97.0 + 1/99.0");

            // Second equation
            System.out.println("\nThe second equation is:\n1/99.0 + 1/97.0 + 1/95.0 + ··· + 1/7.0 + 1/5.0 + 1/3.0");

            // Program Loop
            int mod5 = 0;
            String exit;
            do {
                
                // Menu Loop
                System.out.println("Which equation would you like to run?\n1 = Equation 1\n2 = Equation 2");
                int userSel;
                do {
                    userSel = input.nextInt();
                    if (userSel == 1) {
                        break;
                    } else if (userSel == 2) {
                        break;
                    } else {
                        System.out.println("Please select from the following:\n1 = Equation 1\n2 = Equation 2");
                        userSel = 0;
                    }
                } while(userSel == 0);

                // Setting numerator, denominator, and sum
                double numer = 1d;
                double denom1 = 3d;
                double denom2 = 99d;
                double sum1;
                double sum2;
                double total1 = 0d;
                double total2 = 0d;

                // Running the equations
                switch (userSel) {
                    
                    // Equation 1
                    case 1:
                        //int denom11 = 0;
                        do {
                            sum1 = numer / denom1;
                            total1 += sum1;
                            System.out.println(numer + " divided by " + denom1 + " = " + total1 + "\nPlus: ");
                            denom1 += 2d;
                        } while (denom1 <= 100);

                    // Equation 2
                    case 2:
                        //int denom22 = 0;
                        do {
                            sum2 = numer / denom2;
                            total2 += sum2;
                            System.out.println(numer + " divided by " + denom2 + " = " + total2 + "\nPlus: ");
                            denom2 -= 2d;
                        } while (denom2 >= 2);
                }

                // Program Reloop
                int exx = 0;
                do {
                    exit = input.nextLine();
                    if (exit.equalsIgnoreCase("y")) {
                        exx++;
                        break;
                    } else if (exit.equalsIgnoreCase("n")) {
                        System.out.println("\nThank you for trying out this program!\n");
                        exx++;
                        mod5++;
                        break;
                    } else {
                        System.out.println("\nPlease select an option\nY = Rerun the Program\nN = Exit");
                    }
                } while (exx == 0);

            } while (mod5 == 0);            
        }
    }   
}
