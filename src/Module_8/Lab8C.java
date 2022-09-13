package Module_8;
/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    8
*/
import java.util.Scanner;

public class Lab8C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows,columns,counter=1;
        System.out.println("Please enter the number of rows: ");
            rows = sc.nextInt();
        System.out.println("Please enter the number of columns: ");
            columns = sc.nextInt();
        int oneD = (rows*columns);
        int[] intArr = new int[oneD+1];
        int[] intArr1D = new int[oneD+1];
        System.out.println("I have "+rows+" rows and "+columns+" columns. I need to fill-up "+oneD+" spaces.");
        System.out.println("The "+rows+"x"+columns+" array:");
        for(int i=1;i<=columns;i++){
            intArr[i] = i;
            System.out.println("");
            for(int j=1;j<=rows;j++){
                intArr[j] = counter;
                System.out.print(intArr[j]+"|");
                counter++;
            }
        }
        System.out.println("\nThe 4x4 2-D array flattened into a 16 cell 1-D array:");
        for(int z=1;z<=oneD;z++){
            intArr1D[z] = z;
            System.out.print(intArr1D[z]+"|");
        }
    }
}
