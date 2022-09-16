package Module_3;

import java.util.Scanner;
public class CelesteAss3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("[App Checklist]");
        System.out.print("What mobile device do you have? ");
        String phone = scan.next().toLowerCase();
        if (phone.equals("android")){
            System.out.print("What version do you have? ");
            int version = scan.nextInt();
            if (version >= 11){
                System.out.print("Congratulations, you can run the app!");
            }
            else{
                System.out.print("Does your device support Augmented Reality? ");
                String answer = scan.next().toLowerCase();
                if (answer.equals("yes")){
                    System.out.print("Congratulations, you can run the app!");
                }
                else if (answer.equals("no")){
                    System.out.print("I'm sorry, our app does not support your device.");
                }
            }
        }
        else if (phone.equals("apple")){
            System.out.print("What version do you have? ");
            int version = scan.nextInt();
            if (version >= 12){
                System.out.print("Congratulations, you can run the app!");
            }
            else{
                System.out.print("Does your device support Bluetooth connections? ");
                String answer = scan.next().toLowerCase();
                if (answer.equals("yes")){
                    System.out.print("Congratulations, you can run the app!");
                }
                else if (answer.equals("no")){
                    System.out.print("I'm sorry, our app does not support your device.");
                }
            }
        }
        else{
            System.out.print("I'm sorry, our app does not support your device.");
        }
    }
}