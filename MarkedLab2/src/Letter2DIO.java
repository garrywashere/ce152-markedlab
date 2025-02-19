// Exercise 2

// Import all the necessary libraries for file handling and randomness
import java.io.File;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Letter2DIO {
    // Exercise 2A
    // Initialise maximum coordinate variables of type int
    // Make variables static so they are shared by instances, make them private and make them immutable
    static private final int maxX = 500;
    static private final int maxY = 500;

    // Exercise 2B
    /* This method will be the bane of my existence...
    It's supposed to write random letters (using instances of Letter2D) at random coordinates in a file,
    But getting this to work is going to be a PIA

    EDIT: IT WORKS!!! */
    public static void writeRandomLetters(String fileName, int objectCount) throws FileNotFoundException {
        // Open new file for writing
        PrintStream output = new PrintStream(fileName);
        // Create instance of random
        Random random = new Random();

        // Loop however many lines are specified in parameter
        for (int i = 0; i < objectCount; i++) {
            // Generate our coordinates
            int x = random.nextInt(maxX);
            int y = random.nextInt(maxY);

            // Generate random letter
            char randomLetter = (char) ('a' + random.nextInt(26));

            // New Letter2D Object with our values
            Letter2D letter = new Letter2D(x, y, randomLetter);
            // Print new line of letter.toString() to the file
            output.println(letter.toString());
        }

        // Commit changes to the file
        output.close();
    }

    // Read from file and return array of Letter2D objects
    public static Letter2D[] readLetters(String fileName, int lines) throws FileNotFoundException {
        // Initialise Letter2D with the size of the lines in parameters
        Letter2D[] letters = new Letter2D[lines];
        // Make a Scanner object
        Scanner input = new Scanner (new File(fileName));

        for (int i = 0; i < lines; i++) {
            // Read a line from the file
            String outString = input.nextLine();
            // Split the string and parse the variables to desirable data types
            String[] splitString = outString.split(", ");
            char c = splitString[0].charAt(0);
            int x = Integer.parseInt(splitString[1]);
            int y = Integer.parseInt(splitString[2]);

            // Assemble the object
            letters[i] = new Letter2D(x, y, c);
        }

        // Return the letters
        return letters;
    }
}