import java.util.Scanner;
// Exception import for sleep
import java.util.concurrent.TimeUnit;

public class Assignment1B {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your average lab grade: ");
            float lab = sc.nextFloat();
            float labavg = (float) (lab * .10);

            System.out.println("Enter your average assignment grade: ");
                float asn = sc.nextFloat();
                float asnavg = (float) (asn * .40);

                    System.out.println("Enter your midterm exam grade: ");
                        float mid = sc.nextFloat();
                        float midavg = (float) (mid * .20);

                            System.out.println("Enter your final exam grade: ");
                                float exm = sc.nextFloat();
                                float exmavg = (float) (exm * .30);

                                    float fnl = (float) (labavg + asnavg + midavg+ exmavg);

                                    System.out.println("Your weighted lab average is " + labavg);
                                    System.out.println("Your weighted assignment average is " + asnavg);
                                    System.out.println("Your weighted midterm exam average is " + midavg);
                                    System.out.println("Your weighted final exam average is " + exmavg);
                                    System.out.println("Adding numbers...");
                                    // Delay for 2 Seconds
                                    Thread.sleep(2000);
                                    // Display final calculated grade
                                    System.out.println("Your final grade in CSE 1321L is " + fnl);

    }
}
