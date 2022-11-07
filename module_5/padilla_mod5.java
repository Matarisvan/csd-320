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
        }
    }
    
}
