/* 
Luis Padilla
12/13/22
CSD320 Module 10 Assignment

Write four overloaded methods that return the average of an array with the following headers:

public static short average(short [] array)
public static int average(int [] array)
public static long average(long [] array)
public static double average(double [] array)

Write a test program that invokes each of these methods and then displays the average value returned along with a display of the original array elements.
Ensure the display is easy to read and understandable.
Lastly, each array sent into the methods must be of different sizes to ensure the method code is correctly written.

*/


package module_10;

import java.util.Scanner;

public class padilla_mod10 {
    
    // Main Method
    public static void main(String[] args) {

        // Scanner for input
        Scanner input = new Scanner(System.in);
        
        // Welcome Message
        System.out.println("\nHello and Welcome to Module 10!\nToday we will be overloading the \"average\" method 4 times to get a respective average and to display the array itself.");
        
        // Program Loop Variables
        int rerun = 0;
        String exit;
        
        // Array Variables with varying amounts of data
        short[] shortArray = new short[5];
        int[] intArray = new int[7];
        long[] longArray = new long[9];
        double[] doubleArray = new double[11];

        do {
            // Overloading the Average Method
            average(shortArray);
            average(intArray);
            average(longArray);
            average(doubleArray);

            // Loop Question
            System.out.println("\nWould you like to try this program again?");
            while (true) {
                exit = input.nextLine();
                if (exit.equals("1")) {
                    break;
                } else if ( exit.equals("2")) {
                    rerun++;
                    break;
                } else {
                    System.out.println("Please select an option\n1 = Rerun Program\n2 = Exit Program");
                }
            }
        } while (rerun == 0) ;

        // Scanner close
        input.close();

        // Final Message
        System.out.println("\nThank you for trying out this program!\n");
    }

    // 4 Overload Methods
        /*
        I decided to go with random numbers between 0-25 for the tests
        First I created the sum variable
        Second I filled the array with random numbers ranging from 0-25
        Third I printed each individual number in the array
        Fourth I used "+=" to add each number to the sum for a total
        Fifth I divided the sum by the length of array to get an average
        Lastly I printed the average as requested on assignment as well as array.length to prove that the arrays are of varying lengths
        */ 
        
        // Short Method
        public static short average(short [] array){
            System.out.println("\nShort Method:");
            short sum = 0;
            for (int i = 0; i < array.length; i++) {
                array[i] = (short)(Math.random()*25);
                System.out.println(array[i]);
                sum += array[i];                
            }
            short average = (short) (sum / array.length);
            System.out.println("The average for this array is " + average); 
            System.out.println("Array Length = " + array.length);           
            return average;
        }
        
        // Int Method
        public static int average(int [] array) {
            System.out.println("\nInt Method:");
            int sum = 0;           
            for (int i = 0; i < array.length; i++) {
                array[i] = (int)(Math.random()*25);
                System.out.println(array[i]);
                sum += array[i];
            }
            int average = (int) (sum / array.length);
            System.out.println("The average for this array is " + average);
            System.out.println("Array Length = " + array.length);   
            return average;
        }

        // Long Method
        public static long average(long [] array) {
            System.out.println("\nLong Method:");
            long sum = 0;           
            for (int i = 0; i < array.length; i++) {
                array[i] = (long)(Math.random()*25);
                System.out.println(array[i]);
                sum += array[i];
            }
            long average = (long) (sum / array.length);
            System.out.println("The average for this array is " + average);
            System.out.println("Array Length = " + array.length);   
            return average;
        }

        // Double Method
        public static double average(double [] array) {
            System.out.println("\nDouble Method:");
            double sum = 0;           
            for (int i = 0; i < array.length; i++) {
                array[i] = (double)(Math.random()*25);
                System.out.println(array[i]);
                sum += array[i];
            }
            double average = (double) (sum / array.length);
            System.out.println("The average for this array is " + average);
            System.out.println("Array Length = " + array.length);   
            return average;
        }
}
