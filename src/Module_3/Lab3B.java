package Module_3;/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    3
*/
import java.util.Scanner;

public class Lab3B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Course 1 hours: ");
        float c1Hours = sc.nextInt();
        System.out.println("Grade for course 1: ");
        float c1Grade = sc.nextInt(), c1QP = (c1Grade*c1Hours);
        System.out.println("Course 2 hours: ");
        float c2Hours = sc.nextInt();
        System.out.println("Grade for course 2: ");
        float c2Grade = sc.nextInt(), c2QP = (c2Grade*c2Hours);
        System.out.println("Course 3 hours: ");
        float c3Hours = sc.nextInt();
        System.out.println("Grade for course 3: ");
        float c3Grade = sc.nextInt(), c3QP = (c3Grade*c3Hours);
        System.out.println("Course 4 hours: ");
        float c4Hours = sc.nextInt();
        System.out.println("Grade for course 4: ");
        float c4Grade = sc.nextInt(), c4QP = (c4Grade*c4Hours);
            float totHours = (c1Hours+c2Hours+c3Hours+c4Hours),qualityPoints = (c1QP+c2QP+c3QP+c4QP),GPA = (qualityPoints/totHours);
            System.out.println("Total hours is: "+totHours);
            System.out.println("Total quality points is: "+qualityPoints);
            System.out.println("Your GPA for this semester is "+GPA);
    }
}
