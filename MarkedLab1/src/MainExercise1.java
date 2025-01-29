public class MainExercise1 {
    // Main method
    public static void main(String[] args) {
        // Define Exercise1 as an object ex1
        Exercise1 ex1 = new Exercise1();

        // Exercise 1B
        // Run the printEvenUpTo method in object ex1
        ex1.printEvenUpTo(4);

        // Divider for easier readability in the console
        System.out.println("\n=====\n");

        // Exercise 1C
        // Save the output of getABCFromTo to str
        String str = ex1.getABCFromTo('t', 'v');
        // Print the value of str
        System.out.println(str);
    }
}
