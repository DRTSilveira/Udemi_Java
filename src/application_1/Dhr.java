package application_1;

import java.util.Scanner;

public class Dhr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Application to calculate the net salary of an employee");
		System.out.println("Set employee name");
		
		Employee employee1 = new Employee();
		employee1.name = sc.nextLine();
		
		System.out.println("Set gross salary of " + employee1.name);
		employee1.grossSalary = sc.nextDouble();
		
		System.out.println("Set employee salary tax");
		employee1.tax = sc.nextDouble();
		
		System.out.println("Set employee increase salary tax");
		employee1.percentage = sc.nextDouble();
		
		employee1.netSalary(employee1.grossSalary,employee1.tax);
		employee1.finalSalary(employee1.percentage);	
		
		System.out.println(employee1);
		

		sc.close();

	}

}
