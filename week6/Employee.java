package week6;
public class Employee extends Person {
public double annualSalary;
public int yearOfJoining;
public String nationalInsuranceNumber;

public Employee(String name, double annualSalary, int yearOfJoining, String nationalInsuranceNumber) {
    super(name);
    this.annualSalary = annualSalary;
    this.yearOfJoining = yearOfJoining;
    this.nationalInsuranceNumber = nationalInsuranceNumber;
}
}

