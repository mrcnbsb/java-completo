package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.NotEnoughBalanceException;
import exceptions.WithdrawLimitException;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {				
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, initialBalance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double withdraw = sc.nextDouble();
			account.withdraw(withdraw);
			System.out.println("New balande: " + String.format("%.2f", account.getBalance()));
		} catch(WithdrawLimitException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} catch(NotEnoughBalanceException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		sc.close();

	}
}
