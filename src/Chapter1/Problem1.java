package Chapter1;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){
        //program to sum 3 numbers.

        //Scanner object
        Scanner sc = new Scanner (System.in);

        //Variables
        float num1,num2,num3,sum;

        //userInput
        System.out.print("Enter the value of First Number: ");
        num1 = sc.nextFloat();

        System.out.print("Enter the value of Second Number: ");
        num2 = sc.nextFloat();

        System.out.print("Enter the value of Third Number: ");
        num3 = sc.nextFloat();

        //sum
        sum = num1+num2+num3;

        //output
        System.out.print("The sum of Three Numbers is: " + sum);

    }
}
