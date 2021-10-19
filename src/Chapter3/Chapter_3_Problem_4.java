package Chapter3;

public class Chapter_3_Problem_4 {
    public static void main(String[] args) {
        //Program to detect double and triple spaces.

        //Variable
        String example = "Hello  how   are you";

        //Space detection + output
        //for double spaces
        System.out.println("Doubles space in sentence is at index of : " +(example.indexOf("  ")));
        //for triple spaces
        System.out.println("Triple spaces in sentence is at index of : "+(example.indexOf("   ")));
    }
}
