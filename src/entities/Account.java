package entities;

public class Account {
	private int accountNumber;
	private String holderName;
	private double balance;

	public Account(int accountNumber, String holderName) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double value) {
		balance += value;
	}

	public void withdraw(double value) {
		if (value > 0) {
			balance -= value + 5.0;
		}
	}

	public String toString() {
		return "Account " + accountNumber + ", Holder: " + holderName + ", Balance: R$ "
				+ String.format("%.2f", balance);
	}

}
