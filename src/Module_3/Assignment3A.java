package Module_3;

import java.util.Scanner;

/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    3
Summary: A basic dialogue system using nested if statements
*/
public class Assignment3A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("[Epic Quest Simulator]");
        System.out.println("Hello stranger! Do you have time to hear my tale?\n1) Yes\n2) No");
            if(sc.nextInt()==1){
                System.out.println("Thank you! I come from the land of Pax Bisonica. Our country has been taken over by a cruel tyrant!");
                System.out.println("1) That's awful!\n2) What can I do?");
                    if(sc.nextInt()==1){
                        System.out.println("Alas, it is truly terrible...");
                    }
                    System.out.println("Please, you must journey to Pax Bisonica and free our country!\n1) Yes\n2) No");
                        if(sc.nextInt()==1){
                            System.out.println("Hooray!");
                        }
                        else System.out.println("Then all is lost...");
            }
            else System.out.println("Ah, then goodbye...");
    }
}
