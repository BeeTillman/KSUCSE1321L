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

public class Lab5C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x: ");
            int X = sc.nextInt();
        System.out.println("Enter y: ");
            int Y = sc.nextInt();

        switch(X){
            case 0:
               if(Y==0){
                   System.out.println("This point is the origin.");
                   break;
               }
               else System.out.println("This point is on the y axis.");
            default:
                if (X<0){
                    if (Y<0){
                        System.out.println("This point is in the third quadrant.");
                        break;
                    }
                    else if (Y>0) System.out.println("This point is in the second quadrant.");
                    else System.out.println("This point is on the x axis.");
                }
                else if (X>0){
                    if (Y>0){
                        System.out.println("This point is in the first quadrant.");
                        break;
                    }
                    else if (Y<0) System.out.println("This point is in the fourth quadrant.");
                    else System.out.println("This point is on the x axis.");
                }
               }
        }
    }
