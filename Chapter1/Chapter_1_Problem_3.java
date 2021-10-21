package Chapter1;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
        //Greets using name from user

        //Scanner object
        Scanner sc = new Scanner(System.in);

        //Variables
        String name;

        //Input
        System.out.print("Enter your name : ");
        name = sc.next();

        //Output
        //By using simple concatenation
        System.out.print("Hello " +name+ " , Have a nice day!");

    }
}
