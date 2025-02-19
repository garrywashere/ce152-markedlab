// Exercise 1

public class Letter2D {
    // Exercise 1A
    // Initialising private variables of type int and char
    private int x;
    private int y;
    private char c;

    // Exercise 1B
    // The constructor
    public Letter2D(int x, int y, char c) {
        this.x = x;
        this.y = y;
        this.c = c;
    }

    // Exercise 1C
    // Allow the private variables to be read by returning them with these methods
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getChar() {
        return c;
    }

    // Override the method toString() in the 'superclass' to return a neat string: e.g. "z, 5, 3"
    @Override
    public String toString() {
        return c + ", " + x + ", " + y;
    }
}