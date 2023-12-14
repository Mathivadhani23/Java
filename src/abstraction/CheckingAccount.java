package abstraction;

public class CheckingAccount extends Atm {

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount); 
            System.out.println("Withdrawal successfull. Remainingbalance $"+getBalance());
        } else {
            System.out.println("Invalid withdrawal");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Deposit successfull. Updated balance: $"+getBalance());
        } else {
            System.out.println("Invalid deposit");
        }
    }
}

   


