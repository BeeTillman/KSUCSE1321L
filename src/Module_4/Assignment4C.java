package Module_4;
/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    4
*/
import java.util.*;

public class Assignment4C {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("[Backspace Animation]");
        System.out.println("Please enter your sentence: ");
            String sentence = sc.nextLine();
        System.out.println("How many letters do you want to backspace? ");
            int loops = sc.nextInt();
        System.out.print(sentence);
            for(int i = loops; i!=0; i--){
                System.out.print("\b");
                Thread.sleep(500);
            }
    }
}
