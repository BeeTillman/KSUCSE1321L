package Module_3;
/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    3
*/
import java.util.Scanner;
public class Lab3A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Amount Owed: $");
            float balance = sc.nextFloat();
            System.out.println("APR: ");
                float apr = sc.nextFloat();
                    float min = (float) (balance*(apr*0.01)/12),mpr = (apr/12);
                        System.out.println("Monthly Percentage Rate: "+(String.format("%.3f",mpr)));
                        System.out.println("Minimum Payment: $"+(String.format("%.2f",min)));
    }
}
