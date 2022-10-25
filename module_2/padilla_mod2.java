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

import java.util.Scanner;

public class padilla_mod2{
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Welcome to the Energy Calculator\nWe will be calculating how much Energy in Joules it takes to heat up your watery needs!");
            System.out.println("We need 3 things from you:\nWater in Kilograms\nStarting Temperature in Celsius\nDesired Temperature in Celsius");
            
            System.out.println("How much water are you heating up?");
            float waterMass = myObj.nextFloat();
            
            System.out.println("What is the water's current temperature?");
            float initTemp = myObj.nextFloat();

            System.out.println("How warm do you need your water to be?");
            float finalTemp = myObj.nextFloat();

            System.out.println(waterMass);
            System.out.println(initTemp);
            System.out.println(finalTemp);
        }

        //float Q = waterMass (finalTemp - initTemp) * 4184/* 

    }
}