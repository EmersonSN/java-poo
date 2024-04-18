package application;

import java.util.Scanner;

import entities.Account;

public class AccountInitializer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int accountnumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holderName = sc.nextLine();
		
		Account account = new Account(accountnumber, holderName);
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char option = sc.next().charAt(0);
		double balance;
		if (option == 'y') {
			System.out.print("Enter initial deposit value: ");
			balance = sc.nextDouble();
			account.deposit(balance);
		}

		System.out.println("Account data: " + account);
		System.out.println();

		System.out.print("Enter a deposit value: ");
		balance = sc.nextDouble();
		account.deposit(balance);
		System.out.println("Updated account data: " + account);
		System.out.println();

		System.out.print("Enter a withdraw value: ");
		balance = sc.nextDouble();
		account.withdraw(balance);
		System.out.println("Updated account data: " + account);
		System.out.println();

		sc.close();
	}

}
