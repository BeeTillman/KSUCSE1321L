package Module_2;/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    2
*/
import java.util.Scanner;

public class Assignment2A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many people are in your group? ");
            int PPL = sc.nextInt();
        System.out.println("How many groups do you want? ");
            int GROUPS = sc.nextInt();
        int REMAINDER = (PPL%GROUPS);
            System.out.println("If we divide "+PPL+" in "+GROUPS+" groups evenly, "+REMAINDER+" person(s) will be left without a group.");
    }
}
