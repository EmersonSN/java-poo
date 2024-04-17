package entities;

/*Classe para solução do exercicio de fixação 2*/

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double percentage) {
		double newValue = percentage / 100;
		grossSalary += grossSalary * newValue;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}
