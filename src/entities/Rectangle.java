package entities;

/*Classe para solução do exercicio de fixação 1*/

public class Rectangle {
	public double widht;
	public double height;

	public double area() {
		return widht * height;
	}

	public double perimeter() {
		return 2 * (widht + height);
	}

	public double diagonal() {
		double sqrt = Math.pow(widht, 2) + Math.pow(height, 2);
		return Math.sqrt(sqrt);
	}

}
