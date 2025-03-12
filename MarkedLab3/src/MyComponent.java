import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

public class MyComponent extends JComponent implements MouseListener, KeyListener {
    private final Map<Integer, Integer> quadrantEventCount = new HashMap<>();

    // Initialise the thing, I see this like `void setup() {}` in Arduino
    public MyComponent() {
        setPreferredSize(new Dimension(400, 400));
        addMouseListener(this);
        addKeyListener(this);
        setFocusable(true);
    }

    // Piss around with colours and add lines
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.LIGHT_GRAY);
        g.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
        g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
    }

    // Define the sizes of each quadrant from the window height and width
    private int getQuadrant(int x, int y) {
        int width = getWidth();
        int height = getHeight();

        if (x < width / 2 && y < height / 2) return 1;
        if (x >= width / 2 && y < height / 2) return 2;
        if (x >= width / 2 && y >= height / 2) return 3;
        return 4;
    }

    // Track and print what happens and where
    private void registerEvent(int quadrant) {
        quadrantEventCount.put(quadrant, quadrantEventCount.getOrDefault(quadrant, 0) + 1);
        System.out.println(quadrantEventCount);
    }

    // Override what will happen when there's a mouse event (print the status)
    @Override
    public void mouseClicked(MouseEvent e) {
        int quadrant = getQuadrant(e.getX(), e.getY());
        System.out.println("Mouse Clicked in Quadrant: " + quadrant + " | Button: " + e.getButton());
        registerEvent(quadrant);
    }

    // Same thing as above, but with keystrokes
    @Override
    public void keyPressed(KeyEvent e) {
        Point mousePos = getMousePosition();
        if (mousePos != null) {
            int quadrant = getQuadrant(mousePos.x, mousePos.y);
            System.out.println("Key Pressed: " + e.getKeyChar() + " in Quadrant: " + quadrant);
            registerEvent(quadrant);
        }
    }

    // bruh, I need these because I'm using interfaces, if I used adapters I'd be chilling
    // I am NOT rewriting this...
    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}
    @Override public void keyReleased(KeyEvent e) {}
}