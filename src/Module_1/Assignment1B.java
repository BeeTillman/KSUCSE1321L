package Module_1;

import java.util.Scanner;
// Exception import for sleep
import java.util.concurrent.TimeUnit;

public class Assignment1B {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        // Taking inputs and calculating weighted average from those inputs
        System.out.println("Enter your average lab grade: ");
            float lab = sc.nextFloat(), labavg = (float) (lab * .10);
            System.out.println("Enter your average assignment grade: ");
                float asn = sc.nextFloat(), asnavg = (float) (asn * .40);
                    System.out.println("Enter your midterm exam grade: ");
                        float mid = sc.nextFloat(), midavg = (float) (mid * .20);
                            System.out.println("Enter your final exam grade: ");
                                float exm = sc.nextFloat(), exmavg = (float) (exm * .30);
                                    // Calculating final grade average and outputting it
                                    float fnl = (float) (labavg + asnavg + midavg+ exmavg);
                                    System.out.println("Your weighted lab average is "+labavg+"\nYour weighted assignment average is "+asnavg+"\nYour weighted midterm exam average is "+midavg+"\nYour weighted final exam average is "+exmavg);
                                    System.out.println("Adding numbers...");
                                    // Delay for 4 Seconds
                                    Thread.sleep(4000);
                                    // Display final calculated grade
                                    System.out.println("Your final grade in CSE 1321L is " + fnl);
    }
}
