// Not part of the brief, this is for development testing purposes

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        final String fileName = "Letter2DIOTest.txt";

        Letter2DIO Letter2DIOTest = new Letter2DIO();
        try {
            Letter2DIOTest.writeRandomLetters(fileName, 10);
        } catch (Exception e) {
            System.out.println("Java shat the bed, spitting error now...");
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(Arrays.toString(Letter2DIOTest.readLetters(fileName, 10)));
        } catch (Exception e) {
            System.out.println("Java gives me a headache...");
            System.out.println(e.getMessage());
        }
    }
}