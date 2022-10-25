/*
Luis Padilla
10/24/22
CSD320 Module 1 Assignment

Write a program that displays the results of:
4 x ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 )
And
4 x ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 )
In your comments, add a discussion on the difference between the two outputs and the cause. Which is best? Why?
*/

public class padilla_mod1 {
    public static void main(String[] args) {
        System.out.println("For Mod 1 we were tasked to display 2 different formulas");
        System.out.println();
        System.out.println("This first one is:");
        System.out.println(" 4 x ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 )");
        System.out.print("The answer for this one is: ");
        double eq1 = 4 * ( 1.01 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 );
        System.out.println(eq1);
        System.out.println();
        System.out.println("The second equation is:");
        System.out.println("4 x ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 )");
        System.out.print("The answer for this one is: ");
        int eq2 = 4 * ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13 );
        System.out.println(eq2);
        System.out.println();
    }
}

/*
The difference between the two equations is that the first one (eq1) uses the "float" type of variable while the second (eq2) uses the "int" type of variable.
With eq1 we get the exact answer that is requested from the formula. This is because the "float" variable allows us to have decimal places after the whole number.
    This gets us an exact number without having to round down.
With eq2 we use the "int" variable which removes the ability to have decimals thus causing the numbers being manipulated to round down. With this rounding,
    the numbers are now not the exact numbers that we need so the equation will not be less accurate.
Using float is a better method for solving equations since it allows for decimals to exist which gives you the accurate answer you are looking for
 */ 
