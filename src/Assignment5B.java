import java.util.Scanner;

public class Assignment5B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[12][31];
        int month,day,input;

        System.out.println("[What's your sign?]");
        System.out.println("What month were you born in? ");
            input = sc.nextInt();
            if(input<=12 && input>0){
                month = input;
                System.out.println("And what day? ");
                input = sc.nextInt();
                if(input<=31 && input>0) {
                    day = input;
                    for (int i = 0; i < 12; i++) {
                        for (int j = 0; j < 31; j++) {
                            if((i==0 && j<=18)||(i==11 && j>=21)){
                                arr[i][j] = "Capricornus";
                            }
                            if((i==0 && j>=19)||(i==1 && j<=17)){
                                arr[i][j] = "Aquarius";
                            }
                            if((i==1 && j>=18)||(i==2 && j<=19)){
                                arr[i][j] = "Pisces";
                            }
                            if((i==2 && j>=20)||(i==3 && j<=18)){
                                arr[i][j] = "Aries";
                            }
                            if((i==3 && j>=19)||(i==4 && j<=19)){
                                arr[i][j] = "Taurus";
                            }
                            if((i==4 && j>=20)||(i==5 && j<=20)){
                                arr[i][j] = "Gemini";
                            }
                            if((i==5 && j>=21)||(i==6 && j<=21)){
                                arr[i][j] = "Cancer";
                            }
                            if((i==6 && j>=22)||(i==7 && j<=21)){
                                arr[i][j] = "Leo";
                            }
                            if((i==7 && j>=22)||(i==8 && j<=21)){
                                arr[i][j] = "Virgo";
                            }
                            if((i==8 && j>=22)||(i==9 && j<=22)){
                                arr[i][j] = "Libra";
                            }
                            if((i==9 && j>=23)||(i==10 && j<=20)){
                                arr[i][j] = "Scorpio";
                            }
                            if((i==10 && j>=21)||(i==11 && j<=20)){
                                arr[i][j] = "Sagittarius";
                            }
                        }
                    }
                    System.out.println("Your sign is " + arr[month - 1][day - 1]);
                }
                else System.out.println("That is not a valid day...");
            }
            else System.out.println("That is not a valid month...");
    }
}
