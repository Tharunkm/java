package week6;
public class TestEmployee {
    public static void main(String[] args) {
        // Test the Employee class
        Employee employee = new Employee("John Doe", 50000.0, 2020, "123-456-789");
        
        // Accessing inherited member variable from Person class
        System.out.println("Employee Name: " + employee.name);
        
        // Accessing member variables from Employee class
        System.out.println("Annual Salary: $" + employee.annualSalary);
        System.out.println("Year of Joining: " + employee.yearOfJoining);
        System.out.println("National Insurance Number: " + employee.nationalInsuranceNumber);
    }
}