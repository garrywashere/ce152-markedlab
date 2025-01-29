public class MainExercise2 {
    public static void main(String[] args) {
        // New object em1, employee method
        Employee em1 = new Employee("John Doe", 5_000);

        // Exercise 2B
        // Print employee name using em1
        System.out.println(em1.getName());
        // Print employee salary using em1
        System.out.println(em1.getAnnualSalary());

        // Separator for readability in console
        System.out.println("\n=====\n");

        // Exercise 2C
        // This was a painful experience
        System.out.println(em1.getIncomeTax());
        // Print details
        em1.printEmployeeDetails();

        // Separator for readability in console
        System.out.println("\n=====\n");

        // Exercise 2D
        // Initialise a new programmer
        Programmer pr1 = new Programmer("Jane Doe", 4_900, "Java");

        // Print their name
        System.out.println(pr1.getName());
        // Print their details
        pr1.printEmployeeDetails();

        // Separator for readability in console
        System.out.println("\n=====\n");

        // Exercise 2E
        // Test cases from instructions document
        Employee p0 = new Employee("Tim", 1000);
        p0.printEmployeeDetails();

        Programmer p1 = new Programmer("Bob", 1250, "Python");
        p1.printEmployeeDetails();

        Programmer p2 = new Programmer("Winston", 4000, "C#");
        p2.printEmployeeDetails();

        Programmer p3 = new Programmer("Alice", 8000, "Java");
        p3.printEmployeeDetails();
    }
}
