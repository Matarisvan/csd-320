/*
 Luis Padilla
 11/11/22
 CSD320 Module 6 Assigment

 Write a program that uses nested for loops to output the following with the shown display format:
                                   1               @
                                 1 2 1             @
                               1 2 4 2 1           @
                             1 2 4 8 4 2 1         @
                          1 2 4 8 16 8 4 2 1       @
                       1 2 4 8 16 32 16 8 4 2 1    @
                    1 2 4 8 16 32 64 32 16 8 4 2 1 @
 */

package module_6;

import java.util.Scanner;

public class padilla_mod6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // Welcome Message
            System.out.println("\nWelcome to Module 6!\n");
            
              // Declare variables
              int row = 6;
              int num = 0;
              int i;
              int j;
 
              // For
              for(i = 0; i <= row; i++) {

                // Spaces on left
                for (j = i; j < row; j++) {
                  System.out.print("  ");
                }
                // Equation 1
                for (j = 0; j < i; j++) {
                  System.out.printf("%2d" , (int)Math.pow(2 , num));
                  num++;
                }
                
                // Equation 2
                for (j = 0; j <= i; j++) {
                  System.out.printf("%2d" , (int)Math.pow(2 , num));
                  num--;
                }
                
                // Spaces on right
                for (j = i; j <= row; j++) {
                  System.out.print("  ");
                }
              
                // Print "@" at the end of the line
                System.out.print("@");
                
                // Print next iteration on new line
                System.out.println(); 
              }

              
                 
            
            // Print blank line at end of Program for aesthetics
            System.out.println();
        }
        
        catch (Exception e) {
          System.out.println("An error has occured my friend :o");
        }
        
    }
    
}




/*
 * // Declaring formula variables
            int row;
            int column;
            int space;

            // Formula
            for (row = 1; row <= 7; row++) {
              
              // Spaces on the left
              for(space = 7; space > row; --space) {
                System.out.print(" ");
              }
              
              // Equation 1
              for(column = 1; column <= row; column++) {
                System.out.print(column + " ");
              }

              // Equation 2
              for (column = 1; column <= row; column++) {
                System.out.print(column + " ");
              }

              // Spaces on the right
              for (space = 7; space > row; space--) {
                System.out.print(" ");
              }
 */