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

public class Lab4C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inNUM = -2147483648;
        System.out.println("Welcome!\nPlease enter a number: ");
        float NUM = sc.nextFloat();
        // While Statement ensures program doesn't end if an invalid input is received
        while (inNUM == -2147483648) {
            System.out.println("What would you like to do with this number:\n0- Get the additive inverse of the number\n1- Get the reciprocal of the number\n2- Square the number\n3- Cube the number\n4- Exit the program");
            inNUM = sc.nextInt();
            // Switching function according to the input
            switch (inNUM) {
                case 0 -> System.out.println("The additive inverse of " + NUM + " is " + -NUM);
                case 1 -> System.out.println("The reciprocal of " + NUM + " is " + 1 / NUM);
                case 2 -> System.out.println(NUM + " Squared, is " + NUM * NUM);
                case 3 -> System.out.println(NUM + " Cubed, is " + NUM * NUM * NUM);
                case 4 -> System.out.println("Thank you, goodbye!");
                default -> {
                    System.out.println("Invalid input, please try again!");
                    inNUM = -2147483648;
                }
            }
        }
    }
}
