// Exercise 3

// Import things, not efficient at all but as long as it works
import javax.swing.*;
import java.awt.*;

public class Letter2DDisplay extends JComponent {
    // Exercise 3A
    // letters can only be accessed in this class
    private Letter2D[] letters;

    // Exercise 3B
    // Constructor
    public Letter2DDisplay(Letter2D[] letters) {
        this.letters = letters;
    }

    // Exercise 3C
    // Override the paintComponent, to set own options (such as font)
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 20));

        // Iterate through letters and draw the specified "strings" on the random coordinates fetched
        for (Letter2D letter : letters) {
            g.drawString(String.valueOf(letter.getChar()), letter.getX(), letter.getY());
        }
    }
}