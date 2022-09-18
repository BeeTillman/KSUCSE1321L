/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    6
*/
import java.util.Scanner;

public class Lab6A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int highNUM = -1;
        System.out.println("Please enter 10 numbers and this program will display the largest.");
        for(int i=1;i<=10;i++){
            System.out.println("Please enter number "+i+": ");
            int inNUM = sc.nextInt();
            if(inNUM>=highNUM) highNUM = inNUM;
        }
        System.out.println("The largest number was "+highNUM);
    }
}
