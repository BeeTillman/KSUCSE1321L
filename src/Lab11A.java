import java.util.Scanner;

public class Lab11A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sent = 1,iInput;
        String valid = "yes",sInput;
        while(sent==1){
            System.out.println("Menu");
            System.out.println("0) Hello World");
            System.out.println("1) Goodbye Moon");
            System.out.println("2) Walking on Sunshine");
            System.out.println("What would you like to do:");
                iInput = sc.nextInt();

            switch(iInput){
                case 0:
                    System.out.println("Hello!"); break;
                case 1:
                    System.out.println("Ok, bye."); break;
                case 2:
                    System.out.println("WHOA!"); break;
            }
            System.out.println("Type YES to rerun.");
                sInput = sc.next();

            if(sInput.equalsIgnoreCase(valid)) sent = 1;
            else {
                sent = 0;
                System.out.println("Program Ends");
            }
        }
    }
}
