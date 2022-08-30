package Module_5;
/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    5
*/
import java.util.Scanner;
public class Lab5A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /* Creating parameters for Driving Permit and Commercial License
           & creating a configurable string to output a failure prompt.*/
        char permitA, permitB;
        String invalid = "Invalid Input, please type \"Y\" or \"N\"";
            // Asking for Y/N input then comparing the stored char value to determine the output
            System.out.println("Do you have a driving permit (Y/N)? ");
            permitA = sc.next().charAt(0);
            if (permitA == 'Y'||permitA == 'y'||permitA == 'N'||permitA == 'n') {
                if (permitA == 'Y' || permitA == 'y') {
                    System.out.println("Do you have a commercial driving license (Y/N)? ");
                    permitB = sc.next().charAt(0);
                    if (permitB == 'Y' || permitB == 'y') {
                        System.out.println("Congratulations! You can purchase a vehicle, let's start talking options!");
                    } else System.out.println("Commercial driving license is a prerequisite to purchase a vehicle!");
                } else System.out.println("Driving permit is a prerequisite to purchase a vehicle!");
            }
            else System.out.println(invalid);
    }
}
