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

public class Assignment4A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stuNUM = 1;
        int sentinel = 1;
        String studentIn;
        String highCount = "";
        int italyRes = 0, costaRes = 0, paxRes = 0, ghanaRes = 0;

        System.out.println("[CCSE Study Abroad Survey]");
        while (sentinel != 0) {
            System.out.println("Student#" + stuNUM + ": Which country should we go to for our next study abroad program?");
            System.out.print("Italy\nCosta Rica\nPax Bisonica\nGhana\n(Type Quit to end the survey)");
            studentIn = sc.nextLine().toLowerCase();
            if(studentIn.equals("quit")) {
                System.out.println("[Results]");
                System.out.println("Italy: " + italyRes);
                System.out.println("Costa Rica: " + costaRes);
                System.out.println("Pax Bisonica: " + paxRes);
                System.out.println("Ghana: " + ghanaRes);
                System.out.println("Next year’s study abroad program will take place in " + highCount);
                sentinel = 0;
            }
            else if(studentIn.equals("italy")) {
                System.out.println("Thank you!");
                italyRes++;
            }
            else if(studentIn.equals("costa rica")) {
                System.out.println("Thank you!");
                costaRes++;
            }
            else if(studentIn.equals("pax bisonica")) {
                System.out.println("Thank you!");
                paxRes++;
            }
            else if(studentIn.equals("ghana")) {
                System.out.println("Thank you!");
                ghanaRes++;
            }
                if (italyRes > costaRes && italyRes > paxRes && italyRes > ghanaRes) highCount = "Italy";
                if (costaRes > italyRes && costaRes > paxRes && costaRes > ghanaRes) highCount = "Costa Rica";
                if (paxRes > italyRes && paxRes > costaRes && paxRes > ghanaRes) highCount = "Pax Bisonica";
                if (ghanaRes > italyRes && ghanaRes > costaRes && ghanaRes > paxRes) highCount = "Ghana";
                stuNUM++;
            }
        }
    }
