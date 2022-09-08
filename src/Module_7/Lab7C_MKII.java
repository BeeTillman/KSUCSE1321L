package Module_7;

import java.util.Scanner;

public class Lab7C_MKII {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a value for the size: ");
            int i, j, SZ = sc.nextInt();
        System.out.println("This is the requested " + SZ + "x" + SZ + " right-triangle:");
        for (i=0; i<SZ; i++)
        {
            for (j=2*(SZ-i); j>=0; j--)
            {
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
