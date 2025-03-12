import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    // a main method
    public static void main(String[] args) {
        // Initialise the scanner for input
        Scanner scanner = new Scanner(System.in);
        // Initialise the book ArrayList
        ArrayList<Book> books = new ArrayList<>();

        System.out.println("Enter book details (title pages year) or type 'quit' to exit:");

        // Conditional Loop
        while (true) {
            System.out.print("Enter: ");
            // Take input and remove whitespace at the start and end
            String input = scanner.nextLine().trim();

            // Exit if input is "quit"
            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            // Split string by spaces
            String[] parts = input.split("\\s+");

            // Complain if there aren't 3 things
            if (parts.length != 3) {
                System.out.println("Error: Please enter exactly 3 values (title pages year).");
                continue;
            }

            // Validate everything is input correctly by trying
            // and catching NumberFormatException (average sunday night)
            try {
                String title = parts[0];
                int pages = Integer.parseInt(parts[1]);
                int year = Integer.parseInt(parts[2]);

                Book book = new Book(title, pages, year);
                books.add(book);
                System.out.println("Book added: " + book);
            } catch (NumberFormatException e) {
                System.out.println("Error: Pages and year must be numeric values.");
            }
        }

        // Spit results out on exit
        System.out.println("\nSorted Books:");
        books.sort(null);
        for (Book book : books) {
            System.out.println(book);
        }

        // Goodbye, World!
        System.out.println("Program terminated.");
        scanner.close();
    }
}
