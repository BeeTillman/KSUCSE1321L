package Module_2;/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    2
*/
import java.text.DecimalFormat;
import java.util.Scanner;
public class Assignment2B {
    // Setting Decimal Format to allow for 4 Spaces
    private static final DecimalFormat dfZero = new DecimalFormat("0.0000");
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X coordinate for Keyframe #1: ");
            int x1 = sc.nextInt();
        System.out.println("Enter the X coordinate for Keyframe #2: ");
            int x2 = sc.nextInt();
        System.out.println("How many frames have passed? ");
            float FRAMES = sc.nextFloat();
        // Calculating Values
        int TOTAL = (x2-x1);
        float CURRENT30 = x1+(TOTAL*(FRAMES/30));
        float CURRENT60 = x1+(TOTAL*(FRAMES/60));
            System.out.println("The character has to move "+TOTAL+" places in a second.");
            System.out.println("At 30 FPS, their current X position would be "+dfZero.format(CURRENT30)+".");
            System.out.println("At 60 FPS, their current X position would be "+dfZero.format(CURRENT60)+".");
    }
}
