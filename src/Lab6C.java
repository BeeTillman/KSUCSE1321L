import java.util.Scanner;

/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    6
*/
public class Lab6C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int BAL = 1000; // Declaring starting balance
        System.out.println("Welcome!\nYou have $"+BAL+" in your account.");
            char YN = 'Y'; // Delcaring Yes or No input as Y to make while loop run
        while(YN=='Y'||YN=='y'){ // Making while loop run if Y or y is equal to YN
            System.out.println("Menu\n0 - Make a deposit\n1 - Make a withdrawal\n2 - Display account value");
            System.out.println("Please make a selection: ");
                int inNUM = sc.nextInt();
            switch(inNUM){
                case 0:
                    System.out.println("How much would you like to deposit? : ");
                        BAL += sc.nextInt();
                        System.out.println("Your current balance is $"+BAL);
                        break;
                case 1:
                    System.out.println("How much would you like to withdraw? : ");
                        BAL -= sc.nextInt();
                        System.out.println("Your current balance is $"+BAL);
                        break;
                case 2:
                    System.out.println("Your current balance is $"+BAL);
                    break;
                default:
                    System.out.println("Invalid entry, please try again.");
            }
                System.out.println("Would you like to return to the main menu (Y/N)? : ");
                    YN = sc.next().charAt(0); // Declaring new YN value to decide whether or not to run menu again
        }
        System.out.println("Thank you for banking with us!");
    }
}
