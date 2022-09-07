package Module_7;

import java.util.Scanner;
/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    7
*/
public class Lab7A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a value for the size: ");
            int SZ = sc.nextInt();
        System.out.println("This is the requested "+SZ+"x"+SZ+" box: ");
            for(int i=1; i<=SZ; i++){ // For loop runs as long as new value 'i' is less than or equal to size input
                System.out.println(); // Prints a new line once next for loop has excuted
                for(int x=1; x<=SZ; x++){ // Prints inputted amount of stars on one line
                    System.out.print("*");
                }
            }
    }
}
