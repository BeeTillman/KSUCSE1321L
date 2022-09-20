/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    6
*/
import java.util.Scanner;
import java.util.Random;

public class Lab6B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int guesses = 1;
            System.out.println("Enter a number between 1 and 1000");
                int inNUM = sc.nextInt();
            while(inNUM>1 && inNUM<1000){
                int guess = rand.nextInt(1000);
                    if(guess==inNUM){
                        System.out.println("I guessed the number was "+guess+" and it only took me "+guesses+" guesses");
                        break;
                    }
                    else{
                        System.out.println("My guess was "+guess);
                        guesses++;
                    }
            }
    }
}
