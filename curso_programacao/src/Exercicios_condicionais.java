import java.util.Locale;
import java.util.Scanner;

public class Exercicios_condicionais {
	public static void main(String[] args) {
//		//Exercício 1
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		if (num >= 0) {
//			System.out.println("NAO NEGATIVO");
//		}
//		else {
//			System.out.println("NEGATIVO");
//		}
//		sc.close();
		
//		//Exercício 2
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		if (num % 2 == 0) {
//			System.out.println("PAR");
//		}
//		else {
//			System.out.println("IMPAR");
//		}
//		sc.close();
		
//		//Exercício 3
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();//		
//		if (a % b == 0 || b % a == 0) {
//			System.out.println("Sao Multiplos");			
//		}
//		else {
//			System.out.println("Nao sao Multiplos");
//		}
//		sc.close();
		
//		//Exercício 4
//		Scanner sc = new Scanner(System.in);
//		int h_inicial = sc.nextInt();
//		int h_final = sc.nextInt();
//		int duracao;		
//		if (h_final < h_inicial) {
//			duracao = 24 - h_inicial + h_final;			
//		}
//		else if (h_inicial == h_final) {
//			duracao = 24;
//		} else {
//			duracao = h_final - h_inicial;
//		}		
//		System.out.printf("O JOGO DUROU %d HORA(S)", duracao);		
//		sc.close();
		
//		//Exercício 5
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		int cod = sc.nextInt();
//		int qtd = sc.nextInt();
//		double total;		
//		if (cod == 1) {
//			total = 4.00 * qtd;
//		}
//		else if (cod == 2) {
//			total = 4.50 * qtd;
//		}
//		else if (cod == 3) {
//			total = 5.00 * qtd;
//		}
//		else if (cod == 4) {
//			total = 2.00 * qtd;
//		}
//		else {
//			total = 1.50 * qtd;
//		}
//		System.out.printf("Total: R$ %.2f", total);		
//		sc.close();
		
//		//Exercício 6
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		double num = sc.nextDouble();
//		if (num >= 0 && num <= 25) {
//			System.out.println("Intervalo [0,25]");
//		}
//		else if (num > 25 && num <= 50) {
//			System.out.println("Intervalo (25,50]");
//		}
//		else if (num > 50 && num <= 75) {
//			System.out.println("Intervalo (50,75]");
//		}
//		else if (num > 75 && num <= 100) {
//			System.out.println("Intervalo (75,100]");
//		}
//		else {
//			System.out.println("Fora de intervalo");
//		}
//		sc.close();
		
//		//Exercício 7
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		double x = sc.nextDouble();
//		double y = sc.nextDouble();
//		
//		if (x == 0.0 && y == 0.0) {
//			System.out.println("Origem");
//		}
//		else if (x == 0.0 && y != 0.0) {
//			System.out.println("Eixo Y");
//
//		}
//		else if (x != 0.0 && y == 0.0) {
//			System.out.println("Eixo X");
//		}
//		else if (x > 0.0 && y > 0.0) {
//			System.out.println("Q1");
//		}
//		else if (x > 0.0 && y < 0.0) {
//			System.out.println("Q4");
//		}
//		else if (x < 0.0 && y > 0.0) {
//			System.out.println("Q2");
//		}
//		else {
//			System.out.println("Q3");
//		}		
//		sc.close();
		
		//Exercício 8
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double valor = sc.nextDouble();
		double imposto;
		if (valor <= 2000.00 ) {
			imposto = 0;
		}
		else if (valor >= 2000.01 && valor <= 3000.00) {
			imposto = (valor-2000)*8/100;
		}
		else if (valor >= 3000.01 && valor <= 4500.00) {
			imposto = 1000*8/100 + (valor-3000)*18/100;
		}
		else {
			imposto = 1000*8/100 + 1500*18/100 + (valor-4500)*28/100;
		}
		if (imposto == 0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f", imposto);		
		}
		sc.close();
	
		
		
		
	}
}
