package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			System.out.println();
			System.out.printf("Employee #%d%n", i+1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			Employee employee = new Employee(id, name, salary);
			list.add(employee);
		}
			
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");		
		int id = sc.nextInt();		
//		boolean foundID = false;
//		for (Employee employee : list) {
//			if(employee.getId() == id) {				
//				foundID = true;
//				System.out.print("Enter the percentage: ");
//				double percentage = sc.nextDouble();
//				employee.increaseSalary(percentage);				
//			}
//		}
//		if(!foundID) {
//			System.out.println("This id does not exist!");
//		}
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");		
		for (Employee employee : list) {
			System.out.println(employee); //toString()
		}
		
		sc.close();
	}
}
