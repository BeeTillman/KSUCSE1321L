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
public class Assignment3B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            int grade,stripes = 0;
            String color;
        System.out.println("[Martial Arts Belt]");
        System.out.println("What belt grade are you?");
            grade = sc.nextInt();

            // Setting stripe value (10,0 have "0" stripes, so the integer does not need to be reset)
            switch(grade){
                case 10,0: break;
                case 9,8,6,4,2: stripes = 1; break;
                case 7,5,3,1: stripes = 2; break;
            }
            // Setting color value
            switch(grade){
                case 10,9: color="white"; break;
                case 8,7: color="yellow"; break;
                case 6,5: color="blue"; break;
                case 4,3: color="green"; break;
                case 2,1: color="brown"; break;
                case 0: color="black"; break;
                default: color="NA";
            }
            // Printing result
            switch(color){
                case "NA": System.out.println("You have no belt..."); break;
                default: System.out.println("You have a "+color+" belt,\nwith "+stripes+" stripes!");
            }
    }
}
