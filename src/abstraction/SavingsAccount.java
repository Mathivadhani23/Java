package abstraction;

    public class SavingsAccount extends Atm {
        public SavingsAccount(String accountNumber, double balance) {
            super(accountNumber, balance);
        }
    
        @Override
        public void withdraw(double amount) {
            if (amount > 0 && amount <= getBalance()) {
                setBalance(getBalance() - amount);
                System.out.println("Withdrawal successful. Remaining balance: $" + getBalance());
            } else {
                System.out.println("Invalid withdrawal amount or insufficient funds.");
            }
        }
    
        @Override
        public void deposit(double amount) {
            if (amount > 0) {
                setBalance(getBalance() + amount);
                System.out.println("Deposit successful. Updated balance: $" + getBalance());
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }
    
        
    }
    

