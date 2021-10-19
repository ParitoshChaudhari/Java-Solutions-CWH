package Chapter3;

public class Chapter_3_Problem_3 {
    public static void main(String[] args) {
        //Filling letter template.

        //Variable
        String letter;
        letter = "Dear <|name|>, Thanks a lot";

        //Replacement
        letter = letter.replace("<|name|>","Harry");

        //output
        System.out.println(letter);
    }
}
