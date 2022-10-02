package Module_7;/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    7
*/
import java.util.Scanner;

public class Lab7B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a value for the size: ");
            int SZ = sc.nextInt();
        System.out.println("This is the requested "+SZ+"x"+SZ+" right-triangle:");
        for(int x=1; x<=SZ; x++){
            for(int y=1; y<=x; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
