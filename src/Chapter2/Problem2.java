package Chapter2;

public class Problem2 {
    public static void main(String[] args) {
        //Encryption and decryption of grade by 8

        //Encryption
        char grade = 'c';
        grade = (char)(grade+8);
        System.out.println("The Encrypted grade is : " + grade);

        //Decryption
        grade = (char)(grade-8);
        System.out.print("The Decrypted grade is : " +grade);
    }
}
