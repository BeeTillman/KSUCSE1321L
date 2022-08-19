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
                    float winc = ((float) wpix / (float) res);
                    float hinc = ((float) hpix / (float) res);
                        // Printing Result
                        System.out.println("At " + res + " PPI, the image is " + winc + " wide by " + hinc + " high.");





    }

}
