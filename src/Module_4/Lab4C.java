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

public class Lab4C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome!\nPlease enter a number: ");
        float NUM = sc.nextFloat();
            System.out.println("What would you like to do with this number:\n0- Get the additive inverse of the number\n1- Get the reciprocal of the number\n2- Square the number\n3- Cube the number\n4- Exit the program");
            int inNUM = sc.nextInt();
                if ((inNUM ==0)||(inNUM ==1)||(inNUM ==2)||(inNUM ==3)||(inNUM ==4)){
                    switch(inNUM){
                        case 0:
                            System.out.println("The additive inverse of "+NUM+" is "+-NUM);
                            break;
                        case 1:
                            System.out.println("The reciprocal of "+NUM+" is "+1/NUM);
                            break;
                        case 2:
                            System.out.println(NUM+" Squared, is "+NUM*NUM);
                            break;
                        case 3:
                            System.out.println(NUM+" Cubed, is "+NUM*NUM*NUM);
                            break;
                        case 4:
                            System.out.println("Thank you, goodbye!");
                    }
                }
                else System.out.println("Invalid input, please try again!");
    }
}
