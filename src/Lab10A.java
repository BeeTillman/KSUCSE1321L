/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    9
*/

import java.util.Scanner;

public class Lab10A {
    public static int getMinimum (int x, int y){
        int minimum;
        if(x>y){
            minimum = y;
        }
        else minimum = x;
        return minimum;
    }
    public static int getMaximum (int x, int y){
        int maximum;
        if(x>y){
            maximum = x;
        }
        else maximum = y;
        return maximum;
    }
    public static float getAverage (int min, int max){
        float average = ((float)max+(float)min)/2;
        return average;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x,y;
        float averageF;
        int averageI = 0;
        System.out.println("Enter number 1: ");
        x = sc.nextInt();
        System.out.println("Enter number 2: ");
        y = sc.nextInt();
        averageF = (getAverage(getMaximum(x,y),getMinimum(x,y)));
        if(averageF%1 == 0) averageI = (int) averageF;
        System.out.println("Min is "+getMinimum(x,y));
        System.out.println("Max is "+getMaximum(x,y));
        if(averageF%1 == 0) System.out.println("Average is "+averageI);
        else System.out.println("Average is "+averageF);
    }
}