package Module_8;

import java.util.Scanner;

/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    8
*/
public class Lab8A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] first = new int[6], second = new int[6];
        int sum1,sum2,sum3,sum4,sum5;
        System.out.println("Please enter 5 integers for the first array:");
        System.out.println("Integer 1: ");
            first[1] = sc.nextInt();
        System.out.println("Integer 2: ");
            first[2] = sc.nextInt();
        System.out.println("Integer 3: ");
            first[3] = sc.nextInt();
        System.out.println("Integer 4: ");
            first[4] = sc.nextInt();
        System.out.println("Integer 5: ");
            first[5] = sc.nextInt();

        System.out.println("Please enter 5 integers for the second array:");
        System.out.println("Integer 1: ");
            second[1] = sc.nextInt();
        System.out.println("Integer 2: ");
            second[2] = sc.nextInt();
        System.out.println("Integer 3: ");
            second[3] = sc.nextInt();
        System.out.println("Integer 4: ");
            second[4] = sc.nextInt();
        System.out.println("Integer 5: ");
            second[5] = sc.nextInt();

            sum1 = first[1]+second[1];
            sum2 = first[2]+second[2];
            sum3 = first[3]+second[3];
            sum4 = first[4]+second[4];
            sum5 = first[5]+second[5];
        System.out.println("The resulting sums are "+sum1+"|"+sum2+"|"+sum3+"|"+sum4+"|"+sum5+"|");
    }
}
