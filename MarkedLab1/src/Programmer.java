public class Programmer extends Employee {
    private String language;

    // Constructor
    public Programmer(String name, double monthlySalary, String language) {
        super(name, monthlySalary);
        this.language = language;
    }

   // Get the favourite language
    public String getLanguage() {
        return language;
    }

    // Override parent method to add language to printEmployeeDetails
    @Override
    public void printEmployeeDetails() {
        super.printEmployeeDetails();
        System.out.println("Language: " + language);
    }
}
