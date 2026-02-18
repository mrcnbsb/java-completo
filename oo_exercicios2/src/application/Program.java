package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();
		
		System.out.print("Is there any initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		double value;
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			value = sc.nextDouble();
			account = new Account(accountNumber, accountHolder, value);
		} else {
			account = new Account(accountNumber, accountHolder);
		}		
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		value = sc.nextDouble();
		account.deposit(value);
		
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		account.withdraw(value);
		
		System.out.println("Updated account data:");
		System.out.println(account);
		
		sc.close();
	}
}
