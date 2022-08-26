package Module_4;
/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    4
*/
import java.util.Scanner;

public class Lab4A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            // Setting Default Letter Grade
            String GRADE = "F";
            System.out.println("Enter the score of your exam: ");
        // Converting Number to Letter Score
        float SCORE = sc.nextFloat();
            if (SCORE >= 98) GRADE = "A+";
            else if (SCORE >= 95) GRADE = "A";
            else if (SCORE >= 92) GRADE = "A-";
            else if (SCORE >= 89) GRADE = "B+";
            else if (SCORE >= 86) GRADE = "B";
            else if (SCORE >= 83) GRADE = "B-";
            else if (SCORE >= 80) GRADE = "C+";
            else if (SCORE >= 77) GRADE = "C";
            else if (SCORE >= 74) GRADE = "C-";
            else if (SCORE >= 71) GRADE = "D+";
            else if (SCORE >= 68) GRADE = "D";
            else if (SCORE >= 65) GRADE = "D-";
        // Printing output of conversion
        System.out.println("Letter grade is: "+GRADE);
    }
}
