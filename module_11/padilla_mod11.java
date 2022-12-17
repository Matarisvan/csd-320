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

public class padilla_mod11 {
    public static void main(String[] args){

        // Welcome Message
        System.out.println("\nHello and Welcome to Module 11!\nToday we will be locating the largest element");

        // Program Loop Variables
        int rerun = 0;
        String exit;

        // Main Variables
        int row = 4;
        int column = 4;
        double [][] doubleArray = new double[row][column];
        int [][] intArray = new int[row][column];

        // Array Creation
        for (int i = 0; i < doubleArray.length; i++){
            for (int j = 0; j < doubleArray.length; j++) {
                doubleArray[i][j] = (double)(Math.random()*65);
                System.out.print("[" + i + "][" + j + "] = " + doubleArray[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        for (int i = 0; i < intArray.length; i++){
            for (int j = 0; j < intArray.length; j++) {
                intArray[i][j] = (int)(doubleArray[i][j]);
                System.out.print("[" + i + "][" + j + "] = " + intArray[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
            

        




    }


    public static int[] locateLargest(double [][] arrayParam){
        System.out.println("Largest Double:");



        return locateLargest(arrayParam);
    }

    public static int[] locateLargest(int [][] arrayParam){
        return locateLargest(arrayParam);
    }

    public static int[] locateSmallest(double [][] arrayParam){
        return locateSmallest(arrayParam);
    }

    public static int[] locateSmallest(int [][] arrayParam){
        return locateSmallest(arrayParam);
    }



}
