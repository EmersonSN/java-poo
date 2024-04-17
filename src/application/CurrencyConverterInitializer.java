package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class CurrencyConverterInitializer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("what is the dollar price? " );
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double dollars = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.brazilianCurrency(price, dollars));
		
		sc.close();
	}
}
