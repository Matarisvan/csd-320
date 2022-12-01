/*
Luis Padilla
11/28/22
CSD320 Module 7 Assignment

Some Websites impose certain rules for passwords.
Write a method that checks whether a user's input String is a valid password.
Suppose the password rules are as follows:

A password must have at least eight characters.
A password must contain both letters and digits.
A password must contain at least one uppercase character.
A password must contain at least one lowercase character.

*/


package module_7;

import java.util.Scanner;

public class padilla_mod7 {
    
    // Defining the Password Method
    static void getPassword(String password) {
        try(Scanner input = new Scanner(System.in)) {
            
            // Define variables
            int passLoop = 0;
            int passCheck;
            int passNum;
            int i;
            int j;

            // Password Loop
            System.out.println("Please enter the password you would like to test:\t");
            do {
                passCheck = 0;
                
                // Get password from user
                String pass = input.nextLine();
                System.out.println("\nYou chose \"" + pass + "\" as your password");
                
                // Checks length
                if (pass.length() > 7) {
                    System.out.println("\nPassword long enough?\tYes");
                    passCheck++;
                } else {
                    System.out.println("\nPassword not long enough");
                }

                // Checks Lowercase
                String passU = pass.toUpperCase();
                if (pass.equals(passU)) {
                    System.out.println("You need a  Lowercase Letter");
                } else {
                    System.out.println("Lowercase Letter?\tYes");
                    passCheck++;
                }                

                // Checks Uppercase
                String passL = pass.toLowerCase();
                if (pass.equals(passL)) {
                    System.out.println("You need an Uppercase Letter");
                } else {
                    System.out.println("Uppercase Letter?\tYes");
                    passCheck++;
                }

                // Checks for Number
                char[] passD = pass.toCharArray();
                j = 1;
                passNum = 0;
                for (i = pass.length() ; j <= i ; j++) {
                    for(char pd : passD)
                        if (Character.isDigit(pd)) {
                            passNum++;
                            break;
                        }
                }
                if (passNum != 0) {
                    System.out.println("Number?\t\t\tYes");
                    passCheck++;
                } else {
                    System.out.println("You need a number");
                }

                // Checks all requirements
                System.out.println("\nYour password has passed " + passCheck + " out of 4 requirements");
                if (passCheck == 4) {
                    int exit = 0;
                    System.out.print("\nWould you like to try another password?\n1 = Yes\n2 = No\n");
                    while (exit == 0) {
                        String passEx = input.nextLine();
                        if (passEx.equalsIgnoreCase("1")) {
                            System.out.println("\nPlease enter a Password:");
                            exit++;
                            break;
                        } else if (passEx.equalsIgnoreCase("2")) {
                            exit++;                            
                            passLoop++;
                        } else {
                            System.out.println("\nPlease select an option\n1 = Rerun Program\n2 = Exit");
                        }
                    }
                } else {
                    System.out.println("\nPlease enter a password that meets the requirements:");
                }

            } while (passLoop == 0);

        } catch (Exception e) {
            System.out.println("\nOh no. Something has gone wrong :o\n");
        } 
    }


    // Main Program
    public static void main(String[] args) {

        // Welcome Message
        System.out.println("\nHello and Welcome to Module 7!\nToday we will be creating and testing a password!\n");
        System.out.println("Your password must include the following:\nAt least 8 Characters\nAt least 1 Number\nAt least 1 Uppercase Letter\nAt least 1 Lowercase Letter\n");

        // calls getPassword method
        getPassword(null);

        // Final Message
        System.out.println("\nThank You for trying this Program! :)\n");
    }
    
}
