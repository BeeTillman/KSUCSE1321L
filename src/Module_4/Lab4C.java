package Module_4;

import java.util.Scanner;

public class Lab4C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Please input a number: ");
            float NUM = sc.nextFloat();

        System.out.println("What would you like to do to this number: ");
        System.out.println("0- Get the additive inverse of the number");
        System.out.println("1- Get the reciprocal of the number");
        System.out.println("2- Square the number");
        System.out.println("3- Cube the number");
        System.out.println("4- Exit the program");
            int inNUM = sc.nextInt();
            switch (inNUM) {
                case 0: System.out.println("The additive inverse of " + NUM + " is " + -NUM); break;
                case 1: System.out.println("The reciprocal of " + NUM + " is " + 1 / NUM); break;
                case 2: System.out.println("The square of "+NUM+" is " + NUM*NUM); break;
                case 3: System.out.println("The cube of "+NUM+" is " + NUM*NUM*NUM); break;
                case 4: System.out.println("Thank you, goodbye!"); break;
                default: System.out.println("Invalid input, please try again!" ); break;
            }
    }
}
