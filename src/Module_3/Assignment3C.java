package Module_3;

import java.util.Scanner;
/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    3
*/

public class Assignment3C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String OS, COMP="";
        float APL = 12, AND = 11, VER;
            System.out.println("[App Checklist]");
            System.out.println("What mobile device do you have? ");
                OS = sc.next().toLowerCase();
            if(OS.equalsIgnoreCase("apple") || OS.equalsIgnoreCase("android")){
                System.out.println("What version do you have? ");
                   VER = sc.nextFloat();
                   if(OS.equalsIgnoreCase("android")&&VER>=AND) COMP = "true";
                   else if(OS.equalsIgnoreCase("android")&&VER<AND){
                       System.out.println("Does your device support Augmented Reality? ");
                        if(sc.next().equalsIgnoreCase("yes")) COMP= "true";
                   }
                   else if(OS.equalsIgnoreCase("apple")&&VER>=APL) COMP = "true";
                   else if(OS.equalsIgnoreCase("apple")&&VER<APL){
                       System.out.println("Does your device support Bluetooth connections? ");
                        if(sc.next().equalsIgnoreCase("yes")) COMP= "true";
                   }
            }
            if(COMP.equals("true")) System.out.println("Congratulations, you can run the app!");
            else System.out.println("I'm sorry, our app does not support your device.");
    }
}
