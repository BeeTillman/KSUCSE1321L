package Module_2;/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    2
*/
import java.util.Scanner;

public class Lab2C {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a width: ");
                int w = sc.nextInt();
                System.out.println("Enter a height: ");
                    int h = sc.nextInt();
                        int a = (w*h), p = (2*(w+h));
                            System.out.println("The area is " +a+"\nThe perimeter is " +p);
    }
}
