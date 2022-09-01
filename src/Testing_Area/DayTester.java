package Testing_Area;
/*
 ************TESTING AREA***********
 * ALL CODE IN THESE FILES IS VOID *
 *
 *         Day Tester
 *   Made to test array usage
 ***********************************
 */
import java.util.Scanner;

public class DayTester {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
            System.out.println("What day is it? ");
                String currentDay = sc.next();
                if(days[2].equalsIgnoreCase(currentDay)|days[3].equalsIgnoreCase(currentDay)|days[4].equalsIgnoreCase(currentDay)) {
                    if (days[3].equalsIgnoreCase(currentDay)) {
                        System.out.println("You have School today!");
                        System.out.println("You have CSE 1321 Lab at Noon Today");
                    } else {
                        System.out.println("You have School today!");
                        System.out.println("You have Precalc at 9:30AM, CSE 1321 at 2:00PM, and POLS at 3:30PM");
                    }
                }
                else {
                    System.out.println("You Don't have school today!");
                    System.out.println("You only have school on "+days[2]+", "+days[3]+", and "+days[4]);
                }
    }
}
/* NOTES
 - When comparing Strings (Checking if one string is equal to another, for example, in an array (Line 18)), use ".equals"
    instead of "=="
 - Making .equals into .equalsIgnoreCase makes the comparisons ignore case sensitivity
 */
