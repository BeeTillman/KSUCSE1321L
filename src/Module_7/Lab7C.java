package Module_7;/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    7
*/
import java.util.Scanner;

public class Lab7C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a value for the size: ");
        int a,b,SZ = sc.nextInt();
        System.out.println("This is the requested " + SZ + "x" + SZ + " right-triangle:");
            for(a=0; a<SZ; a++){
                for(b=2*(SZ-a); b>=0; b--){
                    System.out.print(" ");
                }
                for(b=0; b<=a; b++){
                    System.out.print("* ");
                }
                    System.out.println();
            }
    }
}
