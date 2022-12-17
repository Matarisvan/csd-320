/*
Luis Padilla
12/16/22
CSD320 Module 11 Assignment

Write methods using the following headers that returns the location of the largest element in the array passed to the 
method returning a one-dimensional array that contains two location elements.
public static int [] locateLargest (double [][] arrayParam)
public static int [] locateLargest (int [][] arrayParam)

Then, write methods using the following headers that returns the location of the smallest element in the array passed
to the method returning a one-dimensional array that contains two location elements.
public static int [] locateSmallest (double [][] arrayParam)
public static int [] locateSmallest (int [][] arrayParam)

*/




package module_11;

import java.util.Scanner;

public class padilla_mod11 {
    public static void main(String[] args){

        // Scanner for input
        Scanner input = new Scanner(System.in);

        // Welcome Message
        System.out.println("\nHello and Welcome to Module 11!\nToday we will be locating the largest element within a 4x4 array containing randomly generated numbers between 1-64");
        
        // Program Loop Variables
        int rerun = 0;
        String exit;

        // Do Loop
        do {
           
            // Main Variables
            double [][] doubleArray = new double[4][4];
            int [][] intArray = new int[4][4];
            
            // Double Array
            System.out.println("\nDouble Array:");
            for (int i = 0; i < doubleArray.length; i++){
                for (int j = 0; j < doubleArray.length; j++) {
                    doubleArray[i][j] = (double)(Math.random()*65);
                    System.out.print("[" + i + "][" + j + "] = " + doubleArray[i][j] + " ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");

            // Largest and Smallest overload methods for double
            locateLargest(doubleArray);
            locateSmallest(doubleArray);

            // Int Array
            for (int i = 0; i < intArray.length; i++){
                for (int j = 0; j < intArray.length; j++) {
                    intArray[i][j] = (int)(Math.random()*65);
                    System.out.print("[" + i + "][" + j + "] = " + intArray[i][j] + " ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
                
                
                
            
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

        } while (rerun == 0);

        input.close();
        
       
    }


    public static int[] locateLargest(double [][] arrayParam){        
        int[] dMax = new int[2];
        double test = 0; 

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam.length; j++) {            
                if (arrayParam[i][j] > test) {
                    test = arrayParam[i][j];
                    dMax [0] = i;
                    dMax [1] = j;
                }                
            }
        }
        System.out.println("The highest value in the array is " + test);
        System.out.println("You can find it at location [" + dMax[0] + "][" + dMax[1] + "]\n" );
        return dMax;
    }

    public static int[] locateLargest(int [][] arrayParam){
        return locateLargest(arrayParam);
    }

    public static int[] locateSmallest(double [][] arrayParam){
        int[] dMin = new int[2];
        double test = 65; 

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam.length; j++) {            
                if (arrayParam[i][j] < test) {
                    test = arrayParam[i][j];
                    dMin [0] = i;
                    dMin [1] = j;
                }                
            }
        }
        System.out.println("The lowest value in the array is " + test);
        System.out.println("You can find it at location [" + dMin[0] + "][" + dMin[1] + "]\n" );
        return dMin;
    }

    public static int[] locateSmallest(int [][] arrayParam){
        return locateSmallest(arrayParam);
    }



}
