// Defining package (My code is organized by module)
package Module_1;/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    1
 */
import java.util.Scanner;


public class Assignment1C {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("[And the next letter is]");
        System.out.println("Please enter a letter: ");
        char ltr = sc.next().charAt(0);
            // Adding 1 to the entered letter and casting to integer variables
            int ltra = ltr + 1;
            int ltrb = ltra +1;
            int ltrc = ltrb +1;
                char ltr1 = (char) ltra;
                char ltr2 = (char) ltrb;
                char ltr3 = (char) ltrc;
            System.out.println("The next letters after " +ltr+ " are " +ltr1+  ", " +ltr2+ ", and " +ltr3+ "!");
    }
}
