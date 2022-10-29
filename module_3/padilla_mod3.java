/*
Luis Padilla
10/25/22
CSD320 Module 3 Assignment

Write a program that is similar to the popular game titled “Rock-Paper-Scissors.”
The program randomly generates the number of 1, 2, or 3 with 1 being Rock, 2 being Paper, and 3 being Scissors.
Then, the program is to prompt the user to enter a value of 1, 2, or 3.
Next, the program displays a clear readable message displaying both the computer’s selection, the user’s selection, and the results.
*/


package csd_320.module_3;

// import Scanner function for user input
import java.util.Scanner;

public class padilla_mod3 {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            
            // Welcome Message 
            System.out.println("\nWelcome to Rock, Paper, Scissors!\n");
            System.out.println("Please make a selection:\n1 for Rock\n2 for Paper\n3 for Scissors");
            
            // Get user selection
            int userSel = myObj.nextInt();
            switch (userSel) {
                case 1:
                System.out.println("\nYou have chosen Rock");
                break;
                case 2:
                System.out.println("\nYou have chosen Paper");
                break;
                case 3:
                System.out.println("\nYou have chosen Scissors");
                break;
                }
            
            // Get cpu selection
            int cpuSel = (int)(Math.random() * 3);
            // System.out.println(cpuSel); // optional to see what cpu number
            switch (cpuSel) {
                case 0:
                System.out.println("CPU has chosen Rock\n");
                break;
                case 1:
                System.out.println("CPU has chosen Paper\n");
                break;
                case 2:
                System.out.println("CPU has chosen Scissors\n");
                break;
            }
            // Calculate Results
            switch (userSel) {
                
                // Different scenarios for Rock
                case 1:
                    if (cpuSel == 0) {
                        System.out.println("You have tied!");
                        break;
                    } else if (cpuSel == 1) {
                        System.out.println("You have lost!");
                        break;
                    } else if (cpuSel == 2) {
                        System.out.println("Congratulations! You have won!");
                        break;
                    }
                
                // Different scenarios for Paper
                case 2:
                    if (cpuSel == 0) {
                        System.out.println("Congratulations! You have Won!");
                        break;
                    } else if (cpuSel == 1) {
                        System.out.println("You have tied!");
                        break;
                    } else if (cpuSel == 2) {
                        System.out.println("You have lost!");
                        break;
                    }
                
                // Different scenarios for Scissors
                    case 3:
                    if (cpuSel == 0) {
                        System.out.println("You have lost!");
                        break;
                    } else if (cpuSel == 1) {
                        System.out.println("Congratulations! You have won!");
                        break;
                    } else if (cpuSel == 2) {
                        System.out.println("You have tied!");
                        break;
                    }
            }
            System.out.println("");       
        }
    }
}

