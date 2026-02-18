package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		//Exercício 1				
//		Rectangle r = new Rectangle();		
//		System.out.println("Enter rectangle width and height:");
//		r.width = sc.nextDouble();
//		r.height = sc.nextDouble();
//		System.out.printf("AREA = %.2f%n", r.area());
//		System.out.printf("PERIMETER = %.2f%n", r.perimeter());
//		System.out.printf("DIAGONAL = %.2f%n", r.diagonal());	
		
		//Exercício 2
//		Employee e = new Employee();
//		System.out.print("Name: ");
//		e.name = sc.nextLine();
//		System.out.print("Gross salary: ");
//		e.grossSalary = sc.nextDouble();
//		System.out.print("Tax: ");
//		e.tax = sc.nextDouble();		
//		System.out.println();
//		System.out.println("Employee: " + e); // = e.toString()		
//		System.out.println();
//		System.out.print("Which percentage to increase salary? ");
//		double percentage = sc.nextDouble();
//		e.increaseSalary(percentage);		
//		System.out.println();
//		System.out.println("Updated data: " + e); // = e.toString()
		
		//Exercício 3
//		Student student = new Student();
//		student.name = sc.nextLine();
//		student.note1 = sc.nextDouble();
//		student.note2 = sc.nextDouble();
//		student.note3 = sc.nextDouble();		
//		System.out.printf("FINAL GRADE = %.2f%n", student.showFinalGrade());
//		System.out.println(student.showResult());	
		
		//Exercício de fixação aula 79
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollar will be bought? ");
		double dollarsBought = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.amountPaid(dollarPrice, dollarsBought));		
		sc.close();
		
		
	}
}
