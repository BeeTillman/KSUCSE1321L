package Testing_Area;
/*
************TESTING AREA***********
* ALL CODE IN THESE FILES IS VOID *
*
*         Array Test
*   Made to test array usage
***********************************
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// This class file contains an area where I can test the array function
public class ArrayTest2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Object[] arr = {0,1,2};
        System.out.println("Array: "+Arrays.toString(arr));
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList());
        arrayList.add(8);
        arr = arrayList.toArray();
        System.out.println("Please enter 5 numbers separated by pressing enter: ");
        while (sc.hasNext()){
            if (sc.hasNextInt()){
                System.out.println(sc.nextInt());
            }

        }
/*        int secondIn = sc.nextInt();
        int thirdIn = sc.nextInt();
        int fourthIn = sc.nextInt();
        int fiveIn = sc.nextInt();
        int[] myArr = {firstIn,secondIn,thirdIn,fourthIn,fiveIn};
        int sum=0;
        for (int value : myArr){
            sum += value;
        }
        float avg = (float)sum/(float)myArr.length;
        System.out.println("You entered: "+ Arrays.toString(myArr));
        System.out.println("The sum of these numbers is "+sum);
        System.out.println("The average of these numbers is "+avg);

*/
    }
}