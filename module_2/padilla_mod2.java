/*
Luis Padilla
10/24/22
CSD320 Module 2 Assignment

Write a program that calculates the energy needed to heat water from an initial temperature to a final temperature.
Your program should prompt the user to enter the amount of water in kilograms and the initial and final temperature of the water.
The formula to use for this program is:
Q = waterMass ( finalTemperature – initialTemperature ) x 4184
waterMass is water weight in kilograms
finalTemperature and initialTemperature are temperatures in Celsius
Q is the results in Joules
*/

// import Scanner function for user input
import java.util.Scanner;

public class padilla_mod2 {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            
            // Welcome Message to inform user of program's function
            System.out.println("\nWelcome to the Energy Calculator!\nWe will be calculating how much energy in Joules it takes to heat up your watery needs!");
            
            // Tells user what information is needed
            System.out.println("\nWe need 3 things from you:\n1) Water in Kilograms\n2) Starting Temperature in Celsius\n3) Desired Temperature in Celsius");
            
            // get user input for water in kg
            System.out.println("\nHow much water are you heating up?");
            float waterMass = myObj.nextFloat();
            
            // get user input for inital temp in Celsius
            System.out.println("What is the water's current temperature?");
            float initTemp = myObj.nextFloat();

            // get user input for desired temp in Celsius
            System.out.println("How warm do you need your water to be?");
            float finalTemp = myObj.nextFloat();

            // equation to calculate energy needed in Joules
            float Q = waterMass*(finalTemp - initTemp) * 4184;
            
            // inform user how much energy is required for their specific situation
            System.out.println("\nIt takes " + Q + " Joules to satisfy your demand.\n");

        }
    }
}