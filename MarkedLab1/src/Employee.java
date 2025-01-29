import java.text.DecimalFormat;

public class Employee {
    // The private variables
    private String name;
    private double monthlySalary;

    // I only just realised in the instructions it says monthly and annual :)
    private double annualSalary;

    // Constructor
    public Employee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
        this.annualSalary = monthlySalary * 12;
    }

    // For returning values with 2 decimal places
    DecimalFormat df = new DecimalFormat("#.00");

    // Method to return the name of employee
    public String getName() {
        return name;
    }

    // Method to return salary of employee
    public String getAnnualSalary() {
        return df.format(annualSalary);
    }

    // Method to return how much income tax is to be paid
    public String getIncomeTax(){
        // Init tax double
        double tax = 0.0;
        double taxable = annualSalary;

        // Conditionals working through the brackets and gradually calculating income
        if (taxable > 125_140) {
            tax += (taxable - 125_140) * 0.45;
            taxable = 125_140;
        } if (taxable > 50_270) {
            tax += (taxable - 50_270) * 0.40;
            taxable = 50_270;
        } if (taxable > 12_570) {
            tax += (taxable - 12_570) * 0.20;
            taxable = 12_570;
        }

        // Return tax to 2 decimal places
        return df.format(tax);
    }

    // Fairy self-explanatory
    public void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Annual Salary: £" + getAnnualSalary());
        System.out.println("Income Tax: £" + getIncomeTax());
    }
}
