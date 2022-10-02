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
        System.out.println("[And the next letter is]\nPlease enter a letter: ");
        char letter = sc.next().charAt(0);
            // Adding 1 to the entered letter and casting to integer variables
            int letterA = (letter+1), letterB = (letterA+1), letterC = (letterB+1);
                char letter1 = (char) letterA, letter2 = (char) letterB, letter3 = (char) letterC;
            System.out.println("The next letters after " +letter+ " are " +letter1+  ", " +letter2+ ", and " +letter3+ "!");
    }
}
