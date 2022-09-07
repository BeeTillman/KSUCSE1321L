package Module_7;

import java.util.Scanner;

public class Lab7C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a value for the size: ");
        int SZ = sc.nextInt();
        System.out.println("This is the requested " + SZ + "x" + SZ + " right-triangle:");
        for (int i = 1; i <= SZ; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print(" ");
                for (int y = 1; y <= x; y++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
