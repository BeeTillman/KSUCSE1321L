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

public class Assignment4B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Please input a number: ");
        float NUM = sc.nextFloat();
        int sentinel = 1;
        while(sentinel != 0){
        System.out.println("What would you like to do to this number: ");
        System.out.println("-1- Re-enter the number");
        System.out.println("0- Get the additive inverse of the number");
        if(NUM!=0)System.out.println("1- Get the reciprocal of the number");
        System.out.println("2- Square the number");
        System.out.println("3- Cube the number");
        System.out.println("4- Exit the program");
        int inNUM = sc.nextInt();
            while(inNUM > 4 || inNUM <-1) {
                System.out.println("Please enter a valid number between -1 and 4: ");
                inNUM = sc.nextInt();
            }
        switch (inNUM) {
            case -1: System.out.println("Please input a number: "); NUM = sc.nextFloat(); break;
            case 0: System.out.println("The additive inverse of " + NUM + " is " + -NUM); break;
            case 1: System.out.println("The reciprocal of " + NUM + " is " + 1 / NUM); break;
            case 2: System.out.println("The square of "+NUM+" is " + NUM*NUM); break;
            case 3: System.out.println("The cube of "+NUM+" is " + NUM*NUM*NUM); break;
            case 4: System.out.println("Thank you, goodbye!"); sentinel = 0; break;
            }
        }
    }
}
