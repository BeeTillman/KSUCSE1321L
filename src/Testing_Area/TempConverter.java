package Testing_Area;
/*
************TESTING AREA***********
* ALL CODE IN THESE FILES IS VOID *
*
*         Temp Converter
*   Made for CSE1321 (Lecture)
***********************************
*/
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the temperature (In Celsius)? ");
            float celsius = sc.nextFloat();
            float fahrenheit = (float) (((9.0/5.0)*celsius)+32);
                if(fahrenheit>=90) System.out.println("HEAT WARNING");
                    else if(fahrenheit>=80) System.out.println("It's mildy hot outside today");
                    else if(fahrenheit>=70) System.out.println("It's not hold, but also not cold today");
                    else System.out.println("The current temperature in fahrenheit is "+fahrenheit+"\nIt is not that hot outside.");

    }
}
