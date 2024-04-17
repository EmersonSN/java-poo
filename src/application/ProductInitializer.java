package application;

import java.util.Scanner;

import entities.Product;

public class ProductInitializer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product product1 = new Product();

		System.out.println("Enter product data:");
		System.out.print("Name:");
		product1.name = sc.nextLine();
		System.out.print("Price: ");
		product1.price = sc.nextDouble();
		System.out.print("Quantity in stock:");
		product1.quantity = sc.nextInt();

		System.out.println();

		System.out.println("Product data: " + product1);

		System.out.println();

		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product1.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product1);

		System.out.println();

		System.out.print("Enter the number of products to e removed from stock: ");
		quantity = sc.nextInt();
		System.out.println();
		product1.removeProducts(quantity);
		System.out.printf("Updated data: " + product1);

		sc.close();
	}

}
