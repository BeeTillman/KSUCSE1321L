package Module_2;
/*
Class:  CSE1321L
Section:    J51
Term:   Fall 2022
Instructor: Jaskirat Singh Sohal
Name:   Billups Tillman
Lab/Assignment#:    2
*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment2C {
    // Setting format for British Dollar and Bison Dollar Output
    private static final DecimalFormat UKDBSD = new DecimalFormat("0.00");
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("[Bisonica Currency Exchange]\nGeneral Bison welcomes you to Pax Bisonica!");
        System.out.println("How many US Dollars do you have? ");
            int USD = sc.nextInt();
        // Stating Conversion Constants
        final double UKD = (USD*.85);
        final double BSD = (UKD/5);
            System.out.println(USD+" US Dollar(s) is "+UKDBSD.format(UKD)+" British Pound(s), which is worth "+UKDBSD.format(BSD)+" Bison Dollar(s)!");
    }
}
