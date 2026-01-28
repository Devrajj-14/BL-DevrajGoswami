package JavaClassObject.level2;

import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void depositMoney(double amount) {
        if (amount <= 0) {
            System.out.println("invalid deposit amount");
            return;
        }
        balance += amount;
        System.out.println("your updated balance is " + balance);
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("invalid withdraw amount");
            return;
        }
        if (balance >= amount) {
            balance -= amount;
            System.out.println("your updated balance is " + balance);
        } else {
            System.out.println("insufficient balance");
        }
    }

    void display() {
        System.out.println("account holder: " + accountHolder);
        System.out.println("account number: " + accountNumber);
        System.out.println("current balance: " + balance);
    }
}

/*
  program: atm simulation
  deposit, withdraw and display balance using switch case
*/
public class AtmSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your name: ");
        String accountHolder = sc.nextLine();

        System.out.print("enter your account number: ");
        int accountNumber = sc.nextInt();

        double balance = 1000000; // starting balance for testing
        BankAccount acc = new BankAccount(accountHolder, accountNumber, balance);

        System.out.println("for deposit press 1");
        System.out.println("for withdraw press 2");
        System.out.println("to display press 3");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("enter deposit amount: ");
                double dep = sc.nextDouble();
                acc.depositMoney(dep);
                break;

            case 2:
                System.out.print("enter withdraw amount: ");
                double wd = sc.nextDouble();
                acc.withdraw(wd);
                break;

            case 3:
                acc.display();
                break;

            default:
                System.out.println("invalid choice");
        }

        sc.close();
    }
}
