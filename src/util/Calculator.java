package util;

/*Sobre a aula de membros estáticos*/

public class Calculator {

	public static double circumference(double radius) {
		return 2 * pi * radius;
	}

	public static double volume(double radius) {
		return 4.0 * pi * Math.pow(radius, 3) / 3.0;
	}

	public static final double pi = 3.14159;

}
