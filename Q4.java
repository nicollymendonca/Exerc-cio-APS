public class Employee {
    private String name;
    private double hourlyRate;
    private double hoursWorked;
    
    public Employee(String name, double hourlyRate, double hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    public double calculateSalary() {
        double salary = hourlyRate * hoursWorked;
        double tax = salary * 0.2;
        double netSalary = salary - tax;
        return netSalary;
    }
    
    public void printPaymentReceipt() {
        double salary = calculateSalary();
        double tax = salary * 0.2;
        double grossSalary = salary + tax;
        System.out.println("Employee: " + name);
        System.out.println("Gross Salary: $" + grossSalary);
        System.out.println("Tax (20%): $" + tax);
        System.out.println("Net Salary: $" + salary);
    }
}

