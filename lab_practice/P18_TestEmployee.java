package lab_practice;

//import lab_practice.P18_Employee;

public class P18_TestEmployee {
	 public static void main(String[] args) {
	        // Test the Employee class
	        P18_Employee employee = new P18_Employee("John Doe", 50000.0, 2020, "123-456-789");
	        
	        // Accessing inherited member variable from Person class
	        System.out.println("Employee Name: " + employee.name);
	        
	        // Accessing member variables from Employee class
	        System.out.println("Annual Salary: $" + employee.annualSalary);
	        System.out.println("Year of Joining: " + employee.yearOfJoining);
	        System.out.println("National Insurance Number: " + employee.nationalInsuranceNumber);
	    }

}
