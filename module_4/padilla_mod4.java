/*
 Luis Padilla
 10/31/22
 CSD320 Module 4 Assigment

 Write a program that prompts a user to enter two strings and then checks the strings entered
 and reports if either the first string is a substring of the second string, 
 or if the second string is a substring of the first string
*/


package module_4;

import java.util.Scanner;

public class padilla_mod4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // Welcome Message
            System.out.println("\nWelcome to Mod 4! Today we will be testing Strings to see if one is a substring of the other.");
            
            // Get first String from user
            System.out.print("\nPlease enter your first line of text:\n");
            String ans1 = input.nextLine();

            // Get second String from user
            System.out.println("\nPlease enter your second line of text:");
            String ans2 = input.nextLine();
            System.out.println();

            // Compare the two Strings
            if (ans2.indexOf(ans1) == -1) {
                System.out.println("Line 1 is not a substring of Line 2");
            } else {
                System.out.println("Line 1 is indeed a substring of Line 2 and can be found at location " + ans2.indexOf(ans1));
            }
            
            if (ans1.indexOf(ans2) == -1) {
                System.out.println("Line 2 is not a substring of Line 1");
            } else {
                System.out.println("Line 2 is indeed a substring of Line 2 and can be found at location " + ans1.indexOf(ans2));
            }
        }
    }
}
