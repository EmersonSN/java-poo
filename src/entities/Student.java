package entities;

/* Classe para solução do exercicio de fixação 3 */

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}

	public String result() {
		String passOrNot;
		if (finalGrade() >= 60.0) {
			passOrNot = "PASS";
		} else {
			double missingPoints = 60 - finalGrade();
			passOrNot = "FAILED \nMISSING " + String.format("%.2f", missingPoints) + " POINTS";
		}
		return passOrNot;
	}
}
