package abstraction;

public class AtmDriver {

        public static void main(String[] args) {
            SavingsAccount s= new SavingsAccount("IUO12345",1000);
            CheckingAccount c= new CheckingAccount("SDU122344",2000);
            
            s.displayAccountInfo();
            c.displayAccountInfo();
            
            s.withdraw(200.0);
            s.deposit(100.0);
            
            c.withdraw(100.0);
            c.deposit(200);
        }
    }
    

