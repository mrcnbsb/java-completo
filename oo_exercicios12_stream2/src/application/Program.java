package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter the file path: "); // C:\\temp\\in6.txt
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			List<Employee> employees = new ArrayList<>();			
			
			String employeeFile = br.readLine();
			while(employeeFile != null) {
				String[] fields = employeeFile.split(",");
				employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				employeeFile = br.readLine();
			}
			
			System.out.print("Enter salary: ");
			double empSalary = sc.nextDouble();
			
			List<String> emails = employees.stream()
					.filter(e -> e.getSalary() > empSalary)
					.map(e -> e.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than $2000.00:");
			emails.forEach(System.out::println);
			
			double sum = employees.stream()
					.filter(e -> e.getName().charAt(0) == 'M')
					.map(e -> e.getSalary())
					.reduce(0.0, (x,y)->x+y);
			System.out.print("Sum of salary of people whose name starts with 'M': " + sum);
			
//			double avg = products.stream() //converteu pra stream
//					.map(p -> p.getPrice())
//					.reduce(0.0, (x,y)->x+y) / products.size();
//			
//			System.out.println("Average price: $ " + String.format("%.2f", avg));

			
//			for(Employee e : employees) {
//				System.out.println(e);
//			}
			
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}	
		sc.close();
	}
}
