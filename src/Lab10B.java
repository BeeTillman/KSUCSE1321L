import java.util.Scanner;
public class Lab10B {
    public static boolean isValid(double width, double height){
        if(width+height>30) return true;
        else return false;
    }
    public static double area(double width, double height){
        return width*height;
    }
    public static double perimeter(double width, double height){
        return (width*2)+(height*2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width, height;
        boolean sent = true;
        String input;
        while (sent == true) {
        System.out.println("Enter width: ");
        width = sc.nextDouble();
        System.out.println("Enter height: ");
        height = sc.nextDouble();
            if (isValid(width, height) == true) {
                System.out.println("This is a valid rectangle");
                System.out.println("The area is: " + area(width, height));
                System.out.println("The perimeter is: " + perimeter(width, height));
            } else {
                System.out.println("This is an invalid rectangle");
            }
            System.out.println("Do you want to enter another width and height (Y/N)? : ");
                input = sc.next();
            if(input.equalsIgnoreCase("N")){
                sent = false;
                System.out.println("Program ends");
            }
        }
    }
}
