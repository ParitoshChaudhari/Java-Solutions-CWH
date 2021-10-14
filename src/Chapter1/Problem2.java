package Chapter1;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        //Cgpa of 3 subjects

        //Scanner Object
        Scanner sc = new Scanner(System.in);

        //Variables
        float maths,english,science,cgpa;

        //input
        System.out.print("Enter your marks of Maths Subject(out of 100): ");
        maths = sc.nextFloat();

        System.out.print("Enter your marks of English Subject(out of 100): ");
        english = sc.nextFloat();

        System.out.print("Enter your marks of Science Subject(out of 100): ");
        science = sc.nextFloat();

        //cgpa calculation
        //multiplying by 10 because cgpa is taken from 10 only
        cgpa = ((maths + english + science)/300)*10;

        //output
        System.out.print("Your CGPA of 3 subject is : " +cgpa);
    }
}
