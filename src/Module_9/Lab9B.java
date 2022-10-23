package Module_9;
/*
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

        int[] arr = new int[12];
        int size = arr.length;

        System.out.println("Please enter 11 numbers:");
        for(int k = 0;k<11;k++){
            System.out.println("Integer "+(k+1)+": ");
            arr[k] = sc.nextInt();
        }
        for(int i = 0;i < size - 1;i++){
            for(int j = 0;j < size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("What is the target number: ");
        int target = sc.nextInt();

        System.out.println("The sorted set is: "+Arrays.toString(arr));

        int low = 0, mid = 0;
        int high = arr.length-1;
        boolean found = false;
        while(high>=low && found==false) {
            mid = (low + high) / 2;
            if (target < arr[mid]) {
                high = mid - 1;
            } else if (target == arr[mid]) {
                found = true;
            } else low = mid + 1;
            if (found == false) {
                System.out.println("Low is " + low);
                System.out.println("High is " + high);
                System.out.println("Mid is " + mid);
                System.out.println("Searching");
            }
        }
        if(found==true){
            System.out.println("The target is in the set.");
        }
        else System.out.println("The target is not in the set.");
    }
}
