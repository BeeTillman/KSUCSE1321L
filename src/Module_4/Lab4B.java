package Module_4;
/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    4
*/
import java.util.Scanner;

public class Lab4B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            // Gathering Day Input
            System.out.println("Enter the day: ");
            String DAY = sc.next();
        // Matching input to school/special days
        if (DAY.matches("(?i).*"+"Monday|Wednesday|Friday")) {
            if (DAY.matches("(?i).*" + "Friday")) System.out.println("It\'s Friday! Friday! Gotta get down on Friday!");
            else System.out.println("I have class today!");
        }
        else System.out.println("I should use this time to do my homework.");
    }
}
