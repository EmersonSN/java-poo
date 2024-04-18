package application;

import java.util.Scanner;

import entities.Product;

public class ProductInitializer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();

		Product product1 = new Product(name, price);

		System.out.println();

		System.out.println("Product data: " + product1);

		System.out.println();

		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product1.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product1);

		System.out.println();

		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		System.out.println();
		product1.removeProducts(quantity);
		System.out.printf("Updated data: " + product1);

		sc.close();
	}

}
