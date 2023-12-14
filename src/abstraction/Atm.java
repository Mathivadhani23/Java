package abstraction;

abstract class Atm {
    private String accountNumber;
	private double balance;

	public Atm(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;

	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
    public void setBalance(double balance) {
		this.balance=balance;

	}


	public abstract void withdraw(double amount);

	public abstract void deposit(double amount);
	
	public void displayAccountInfo() {
		System.out.println("Account number : "+accountNumber);
		System.out.println("Balance :$ "+balance);
	}
}
