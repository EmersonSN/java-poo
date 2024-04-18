package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;

	/* Criando um construtor para que seja obrigatório a inserção de dados */
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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
