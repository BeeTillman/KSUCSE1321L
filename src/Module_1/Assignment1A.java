// Defining package (My code is organized by module)
package Module_1;/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    1
 */
import java.util.Scanner;

public class Assignment1A {

    public static void main(String[] args)
    {
        // Creating Scanner and defining integers/floats
        Scanner sc = new Scanner(System.in);
        // Prompting Width Entry
        System.out.println("Enter the width (in pixels):");
            int wpix = sc.nextInt();
            // Prompting Height Entry
            System.out.println("Enter the height (in pixels):");
                int hpix = sc.nextInt();
                // Prompting Resolution Entry
                System.out.println("Enter the resolution(PPI):");
                int res = sc.nextInt();
                    // Calculating Conversion from Pixels to inches
                    float winc = ((float) wpix / (float) res), hinc = ((float) hpix / (float) res);
                        // Printing Result
                        System.out.println("At " + res + " PPI, the image is " + winc + " wide by " + hinc + " high.");
    }

}
