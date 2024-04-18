package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;

	/* Criando um construtor para que seja obrigatório a inserção de dados */
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	/*
	 * Criando um construtor com sobrecarga do anterior, mas agora sem a quantidade
	 */
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	/* Adicoinando meios de acessar os atributos privados ENCAPSULAMENTO */

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getQuantity() {
		return this.quantity;
	}

	public double totalValueStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", R$" + String.format("%.2f", price) + ", " + quantity + " units, Total: R$"
				+ String.format("%.2f", totalValueStock());
	}
}
