package Module_3;

import java.util.Scanner;

public class Lab3B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Course 1 Hours: ");
        float c1Hours = sc.nextInt();
        System.out.println("Course 1 Grade: ");
        float c1Grade = sc.nextInt(), c1QP = (c1Grade*c1Hours);
        System.out.println("Course 2 Hours: ");
        float c2Hours = sc.nextInt();
        System.out.println("Course 2 Grade: ");
        float c2Grade = sc.nextInt(), c2QP = (c2Grade*c2Hours);
        System.out.println("Course 3 Hours: ");
        float c3Hours = sc.nextInt();
        System.out.println("Course 3 Grade: ");
        float c3Grade = sc.nextInt(), c3QP = (c3Grade*c3Hours);
        System.out.println("Course 4 Hours: ");
        float c4Hours = sc.nextInt();
        System.out.println("Course 4 Grade: ");
        float c4Grade = sc.nextInt(), c4QP = (c4Grade*c4Hours);
            float totHours = (c1Hours+c2Hours+c3Hours+c4Hours),qualityPoints = (c1QP+c2QP+c3QP+c4QP),GPA = (qualityPoints/totHours);
            System.out.println("Total Hours is: "+totHours);
            System.out.println("Total quality points is: "+qualityPoints);
            System.out.println("Your GPA for this semester is: "+GPA);
    }
}
