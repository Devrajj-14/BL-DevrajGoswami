package Inheritance;

/* main file for bank accounts */
public class BankMain {
    public static void main(String[] args) {
        BankAccount a1 = new SavingsAccount(101, 50000, 4.5);
        BankAccount a2 = new CheckingAccount(102, 30000, 10000);

        a1.displayAccountType(); // savings
        a2.displayAccountType(); // checking
    }
}

/* base class bank account */
class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber; // assign number
        this.balance = balance; // assign balance
    }

    void displayAccountType() {
        System.out.println("bank account"); // base type
    }
}

/* savings account */
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // call parent
        this.interestRate = interestRate; // assign rate
    }

    void displayAccountType() {
        System.out.println("savings account"); // override
    }
}

/* checking account */
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); // call parent
        this.withdrawalLimit = withdrawalLimit; // assign limit
    }

    void displayAccountType() {
        System.out.println("checking account"); // override
    }
}
