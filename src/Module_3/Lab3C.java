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

public class Lab3C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Prompting user input and Defining Variables
        System.out.println("Enter the number of quarters: ");
        int QUARTERS = sc.nextInt();
        System.out.println("Enter the number of dimes: ");
        int DIMES = sc.nextInt();
        System.out.println("Enter the number of nickels: ");
        int NICKELS = sc.nextInt();
        System.out.println("Enter the number of pennies: ");
        int PENNIES = sc.nextInt();
            //Listing user input as output
            System.out.println("You entered "+QUARTERS+" quarters.\nYou entered "+DIMES+" dimes.\nYou entered "+NICKELS+" nickels.\nYou entered "+PENNIES+" pennies.");
            //Calculating conversion
            int QUARTERSTOTAL = (QUARTERS*25),DIMESTOTAL=(DIMES*10),NICKELSTOTAL=(NICKELS*5),PENNIESTOTAL=(PENNIES*1);
            int TOTAL = (QUARTERSTOTAL+DIMESTOTAL+NICKELSTOTAL+PENNIESTOTAL);
            int dollars = 0;
            int cents = TOTAL;
            //Removing 100 from the total and cent values until only cents are left, while also adding to the dollar value
            while(TOTAL > 100){
                ++dollars;
                cents = (TOTAL-100);
                TOTAL = (TOTAL - 100);
            }
            System.out.println("You have "+dollars+" dollars and "+cents+" cents.");
    }
}
