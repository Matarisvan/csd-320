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

public class padilla_mod9 {
    public static void main(String[] args){

        //Welcome Message
        System.out.println("\nHello and welcome to module 9!\nToday we will be learning about Arrays and getting 4 different attributes from the array:\nMin, Max, Sum, and Average\n");
        
        // Array method
        ranArray(0);

        
        
    }

    // Create and fill array method
    public static int[] ranArray(int x) {
        // Fill array with 20 random intergers between 0 - 100
        int[] myArray = new int[20];
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = (int)(Math.random()*100);
            System.out.println(myArray[i]);            
        }
        System.out.println("\n" + myArray.length + " = Array length");
        return myArray;
    }

}
