package Testing_Area;

public class MethodTest2 {
    // Creating a method called "myMethod" that includes parameters
    // This method will print the name of my entire family with "Tillman"
    static void myMethod(String fName){
        System.out.println(fName+" Tillman");
    }
    public static void main(String[] args){
        myMethod("Bee");
        myMethod("Phin");
        myMethod("Angie");
        myMethod("Rosey");
        myMethod("Kat");
    }
}

/* NOTES
"fName" is a parameter, "Bee","Phin",etc. are arguments
 */
