package lab_practice;

public class P18_Employee extends P18_Person {
	public double annualSalary;
	public int yearOfJoining;
	public String nationalInsuranceNumber;
	public String name;

	public P18_Employee(String name, double annualSalary, int yearOfJoining, String nationalInsuranceNumber) {
	    super(name);
	    this.annualSalary = annualSalary;
	    this.yearOfJoining = yearOfJoining;
	    this.nationalInsuranceNumber = nationalInsuranceNumber;
	}

}
