package ConstructorsInstance.level3_access_modifiers;

/*
this program demonstrates access modifiers for bank accounts:
accountNumber public, accountHolder protected, balance private
balance is modified using deposit/withdraw methods
*/
public class BankAccountAccessModifiers {

    static class BankAccount {
        public long accountNumber;
        protected String accountHolder;
        private double balance;

        BankAccount(long accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public boolean withdraw(double amount) {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
                return true;
            }
            return false;
        }
    }

    static class SavingsAccount extends BankAccount {
        double interestRate;

        SavingsAccount(long accountNumber, String accountHolder, double balance, double interestRate) {
            super(accountNumber, accountHolder, balance);
            this.interestRate = interestRate;
        }

        void display() {
            System.out.println("account number: " + accountNumber); // public
            System.out.println("holder: " + accountHolder); // protected
            System.out.println("balance: " + getBalance()); // private via getter
            System.out.println("interest rate: " + interestRate);
        }
    }

    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(123456789L, "devraj", 5000, 4.5);
        s1.display();

        s1.deposit(1500);
        s1.withdraw(1200);

        System.out.println("\nafter transactions:");
        s1.display();
    }
}
