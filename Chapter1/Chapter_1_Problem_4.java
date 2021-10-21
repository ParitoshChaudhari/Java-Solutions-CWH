package Chapter1;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        //convert kilometer into miles.

        //Scanner object
        Scanner sc = new Scanner(System.in);

        //Variables
        float kilometer,miles;

        //Input
        System.out.print("Enter the value of Kilometer : ");
        kilometer = sc.nextFloat();

        //conversion
        miles = (float) (kilometer/1.609);

        //output
        System.out.print("Kilometer " +kilometer+ " into miles is : " + miles);
    }
}
