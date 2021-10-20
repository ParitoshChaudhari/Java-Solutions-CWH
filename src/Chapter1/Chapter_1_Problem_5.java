package Chapter1;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args){
        // Program to check whether user enter int or not.

        //Scanner object.
        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Enter your number: ");

        //check and output.
        System.out.print(sc.hasNextInt());
    }
}
