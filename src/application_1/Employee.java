package application_1;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	public double percentage;
	public double netSalary;
	public double finalSalary;

	public void netSalary(double grossSalary, double tax){
		 netSalary = grossSalary - tax;
		
	}

	public void finalSalary(double percentage){
	
		finalSalary = netSalary + grossSalary*percentage/100;
							
	}

	public String toString() {
	return "information of "
		+ name
		+": Gross salary: $"
		+ grossSalary
		+" Net salary: $"
		+ netSalary
		+" Tax applied: $"
		+ tax
		+" Increase tax salary applied: "
		+ percentage
		+" Final salary of "
		+finalSalary;

}
}

