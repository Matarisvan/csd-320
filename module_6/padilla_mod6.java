/*
 Luis Padilla
 11/11/22
 CSD320 Module 6 Assigment

 Write a program that uses nested for loops to output the following with the shown display format:
                                   1               @
                                 1 2 1             @
                               1 2 4 2 1           @
                             1 2 4 8 4 2 1         @
                          1 2 4 8 16 8 4 2 1       @
                       1 2 4 8 16 32 16 8 4 2 1    @
                    1 2 4 8 16 32 64 32 16 8 4 2 1 @
 */

package module_6;

public class padilla_mod6 {
    public static void main(String[] args) {

      // Welcome Message
      System.out.println("\nWelcome to Module 6!\nWe will be using nested for loops to display a pyramid\n");    
        
        // Declare variables
        int row = 6;
        int num;
        int i;
        int j;

        // Outer for loop
        for(i = 0; i <= row; i++) {
          num = 0;

          // Inner for loops
          
          // Spaces on left
          for (j = i; j < row; j++) {
            System.out.print("   ");
          }
          // Equation 1
          for (j = 0; j < i; j++) {
            System.out.printf("%3d" , (int)Math.pow(2 , num));
            num++;
          }
            
          // Equation 2
          for (j = 0; j <= i; j++) {
            System.out.printf("%3d" , (int)Math.pow(2 , num));
            num--;
          }
            
          // Spaces on right
          for (j = i; j <= row; j++) {
            System.out.print("   ");
          }
        
          // Print "@" at the end of the line
          System.out.print("@");
          
          // Print next iteration on new line
          System.out.println(); 
        } 
      
        // Final Message
      System.out.println("\nThank you for trying this Program out!\n");

    } 
}



