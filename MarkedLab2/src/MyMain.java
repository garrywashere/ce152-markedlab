// Exercise 3

// Again I feel like I shouldn't be using .*, but it works
import javax.swing.*;
import java.io.IOException;

// Exercise 3D
public class MyMain {
    public static void main(String[] args) {
        try {
            // Write random letters and coordinates to file "test"
            Letter2DIO.writeRandomLetters("test", 100);
            // Get the contents of file "test" and put into array
            Letter2D[] letters = Letter2DIO.readLetters("test", 100);

            // Make a window called "Letter2D Display"
            JFrame f = new JFrame("Letter2D Display");
            // Set window size to 500x500
            f.setSize(500, 500);
            // Create new Letter2DDisplay object and give letters as a parameter
            f.add(new Letter2DDisplay(letters));
            // Safe exit when window closed
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // Make window visible
            f.setVisible(true);
        } catch (IOException e) {
            // Print errors into console if an exception is hit
            e.printStackTrace();
        }
    }
}