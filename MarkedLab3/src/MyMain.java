import javax.swing.*;

public class MyMain {
    // No comment, it's the main method that opens the window sets what happens
    // when the window closes, its size and makes it visible.
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        MyComponent myComponent = new MyComponent();
        frame.add(myComponent);
        frame.setVisible(true);
    }
}
