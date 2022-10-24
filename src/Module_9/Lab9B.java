package Module_9;/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    9
*/
import java.util.Arrays;
import java.util.Scanner;

public class Lab9B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[11];
        int size = arr.length;

        System.out.println("Please enter 11 numbers:");
        for(int k = 0;k<size;k++){
            System.out.println("Integer "+(k+1)+": ");
            arr[k] = sc.nextInt();
        }

        System.out.println("What is the target number: ");
        int target = sc.nextInt();

        for(int i = 0;i < size;i++){
            for(int j = 0;j < size-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print("The sorted set is: ");
        for (int a = 0; a < size; a++) {
            System.out.print(arr[a]+" ");
        }
        int low = 0, mid = 0;
        int high = arr.length-1;
        boolean found = false;
        while(high>=low) {
            mid = (high + low) / 2;
            System.out.print("\nLow is "+low+"\nHigh is "+high+"\nMid is "+mid+"\nSearching");
            if (target < arr[mid]) {
                high = mid - 1;
            } else if (target == arr[mid]) {
                found = true;
                break;
            } else low = mid + 1;
        }
        if(found==true){
            System.out.println("\nThe target is in the set.");
        }
        else System.out.println("\nThe target is not in the set.");
    }
}
