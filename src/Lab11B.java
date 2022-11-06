import java.util.Scanner;

public class Lab11B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input;
        char ch;
        boolean conLength = false, conUpper = false, conNumber = false;
        System.out.println("Enter a password: ");
            input = sc.next();
            for(int i=0;i < input.length();i++){
                ch = input.charAt(i);
                if(Character.isDigit(ch)){
                    conNumber = true;
                }
                else if(Character.isUpperCase(ch)){
                    conUpper = true;
                }
            }
            if(input.length()>=8){
                conLength = true;
            }
            if(conLength && conUpper && conNumber){
                System.out.println("Valid Password");
                System.out.println("Program Ends");
            }
            else {
                System.out.println("Invalid password");
                System.out.println("Program Ends");
            }
        }
    }
