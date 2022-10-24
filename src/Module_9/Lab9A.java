package Module_9;/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    9
*/
import java.util.Scanner;

public class Lab9A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Declaring array and variables
        int[] array = new int[11];
        int target,j=1,bool=0;
        // Collecting integer input and adding to the array
        System.out.println("Please enter 10 numbers:");
        for(int i=1;i<=10;i++){
            System.out.println("Integer "+i+": ");
                array[i]=sc.nextInt();
        }
        System.out.println("What is the target number: ");
            target = sc.nextInt();
        // Comparing target number to every number within the array
        while(j<=10){
            if(array[j]==target){
                bool = 1;
                j = 11;
            }
            j++;
        }
        if(bool==1) System.out.println("The target is in the set.");
        else System.out.println("The target is not in the set.");
    }
}
