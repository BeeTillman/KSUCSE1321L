package Module_5;
/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    5
*/
import java.util.Scanner;
public class Lab5B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int divNum;

            System.out.println("Enter an integer: ");
                num = sc.nextInt();
            // Deciding what the entered number is divisible by. 2-5, if 2 = true, then it stops
            switch(num%2){
                case 0 -> System.out.println("This number is divisible by 2");
                default -> {
                    switch(num%3){
                        case 0 -> System.out.println("This number is divisible by 3");
                        default -> {
                            switch(num%5){
                                case 0 -> System.out.println("This number is divisible by 5");
                                default -> System.out.println("This number is undetermined");
                            }
                        }
                    }
                }
           }

    }
}
