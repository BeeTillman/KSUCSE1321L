package Module_2;
/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    2
*/
import java.util.Scanner;


public class Lab2A {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name: ");
            String name1 = sc.nextLine();
            System.out.println("Enter another name: ");
                String name2 = sc.nextLine();
                System.out.println("Enter a verb: ");
                    String verb = sc.nextLine();
                    System.out.println("Enter an adverb: ");
                        String adverb = sc.nextLine();

                            System.out.println("Once upon a time, there was a person named " +name1+ " who had a child named " +name2+ ". This child would " +verb+ " " +adverb+ " while singing to strangers.");
    }
}
