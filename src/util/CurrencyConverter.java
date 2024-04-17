package util;

/* Classe para solução do exercicio de fixação sobre metodos estaticos */

public class CurrencyConverter {
	public static final double iof = 6.0/100;
	
	public static double brazilianCurrency(double price, double dolar) {
		return (price * dolar * iof) + price * dolar;
	}
}
