/*
Luis Padilla
12/7/22
CSD320 Module 9 Assignment

Write a program that reads and fills an array with 20 integers.
Then, using the array elements, calculate the data to find and display:

The highest value entered.
The lowest value entered.
The average of the numbers entered.
The sum of the numbers entered.

Display this information in a readable display making the data easy to understand.

*/

package module_9;

import java.util.Arrays;

public class padilla_mod9 {
    public static void main(String[] args){

        //Welcome Message
        System.out.println("\nHello and welcome to module 9!\nToday we will be learning about Arrays and getting 4 different attributes from the array:\nMin, Max, Sum, and Average\n");
        
        // Declare Variables
        int aSum = 0;
        float aAvg = 0;        
        
        // Fill array with 20 random intergers between 0 - 100
        int[] myArray = new int[20];
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = (int)(Math.random()*100);
            System.out.println(myArray[i]);            
        }
        
        // Checks Array length to ensure there are 20 integers
        System.out.println("\n" + myArray.length + " = Array length");

        // Sort array from lowest to highest
        Arrays.sort(myArray) ;
        
        // Get Min
        System.out.println(myArray[0] + " = Min");
        
        // Get Max
        System.out.println(myArray[19] + " = Max");

        // Get sum
        for (int i = 0; i < myArray.length; i++) {
            aSum += myArray[i];
        }
        System.out.println(aSum + " = Sum");

        // Get Average
        aAvg = (aSum / (float)myArray.length);
        System.out.println(aAvg + " = Average");
        
        // Final Message
        System.out.println("\nThank you for trying out this program!\n");                
    }

}
