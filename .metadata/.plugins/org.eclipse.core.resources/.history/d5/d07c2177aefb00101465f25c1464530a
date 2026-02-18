package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		//Generics -> uso comum em coleções
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<String> ps = new PrintService<>();
//		PrintServiceString pss = new PrintServiceString();
//		PrintServiceObject pso = new PrintServiceObject();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();		
		
		for (int i=0; i<n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}
		
		ps.print();
		String x = ps.first(); //casting
		System.out.println("First: " + x);
		
		sc.close();
	}
}
