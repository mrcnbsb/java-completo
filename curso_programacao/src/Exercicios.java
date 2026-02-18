import java.util.Locale;
import java.util.Scanner;

public class Exercicios {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		// Exercício 1
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int soma = num1 + num2;
//		System.out.println("SOMA = " + soma);
		
//		// Exercício 2
//		double raio = sc.nextDouble();
//		double pi = 3.14159;
//		double area = pi * Math.pow(raio, 2.0);
//		System.out.printf("A=%.4f", area);
	
//		// Exercício 3
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		int d = sc.nextInt();
//		int diferenca = (a*b)-(c*d);
//		System.out.println("DIFERENCA = " + diferenca);
		
//		// Exercício 4
//		int funcionario = sc.nextInt();
//		int horasTrabalhadas = sc.nextInt();
//		double valorHora = sc.nextDouble();
//		double salario = horasTrabalhadas * valorHora;
//		System.out.println("NUMBER = " + funcionario);
//		System.out.printf("SALARY = U$ %.2f", salario);
		
//		// Exercício 5
//		int cod1 = sc.nextInt();
//		int qtd1 = sc.nextInt();
//		double valor1 = sc.nextDouble();
//		int cod2 = sc.nextInt();
//		int qtd2 = sc.nextInt();
//		double valor2 = sc.nextDouble();
//		double valorPago1 = qtd1 * valor1;
//		double valorPago2 = qtd2 * valor2;
//		double valorPagoTotal = valorPago1 + valorPago2;
//		System.out.printf("VALOR A PAGAR: R$ %.2f", valorPagoTotal);
		
		// Exercício 6
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double triangulo = a*c/2;
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		double circulo = 3.14159 * Math.pow(c, 2.0);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		double trapezio = (a+b)/2*c;
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		double quadrado = Math.pow(b, 2.0);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		double retangulo = a*b;
		System.out.printf("RETANGULO: %.3f%n", retangulo);		
		
		sc.close();
	}
}
