package application;

import java.util.Scanner;

public class CalculatorInitializer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		System.out.printf("Circumference: %.2f%n", util.Calculator.circumference(radius));
		System.out.printf("Volume:  %.2f%n", util.Calculator.volume(radius));
		System.out.printf("PI value:  %.2f", util.Calculator.pi);
		sc.close();
	}

}
