package umlDigramCode;

import java.util.ArrayList;
import java.util.List;

/*
 * Class: Account
 * Purpose: Stores account details and keeps links to the Bank it belongs to.
 * Notes: This class is used to show association (Account is linked to Bank).
 */
class Account {
    long accNo;
    double balance;
    Bank bank;

    Account(long accNo, double balance, Bank bank) {
        this.accNo = accNo;       // store account number
        this.balance = balance;   // store initial balance
        this.bank = bank;         // link this account to a bank
    }
}

/*
 * Class: Bank
 * Purpose: Creates and stores accounts, and connects customers to accounts.
 * Notes: Demonstrates association with Customer through Account objects.
 */
class Bank {
    String name;
    List<Account> accounts = new ArrayList<>();

    Bank(String name) {
        this.name = name; // store bank name
    }

    void openAccount(Customer c, long accNo, double bal) {
        Account a = new Account(accNo, bal, this); // create account linked to this bank
        accounts.add(a);                           // store account in bank list
        c.accounts.add(a);                         // store account in customer list
    }
}

/*
 * Class: Customer
 * Purpose: Holds customer details and allows checking balance of owned accounts.
 * Notes: Customer is associated with Bank via Account references.
 */
class Customer {
    String name;
    List<Account> accounts = new ArrayList<>();

    Customer(String name) {
        this.name = name; // store customer name
    }

    void viewBalance(long accNo) {
        for (Account a : accounts) {               // go through all accounts of this customer
            if (a.accNo == accNo) {                // check matching account number
                System.out.println(name + " | " + a.bank.name + " | " + accNo + " | " + a.balance); // print details
                return;                            // stop after finding the account
            }
        }
        System.out.println("Not found: " + accNo); // print if account doesn't exist
    }
}

/*
 * Class: Main
 * Purpose: Runs the demo to show association between Bank, Customer, and Account.
 * Notes: Creates objects and calls methods openAccount() and viewBalance().
 */
public class BankCustomer {
    public static void main(String[] args) {
        Bank bank = new Bank("NexBank");          // create bank
        Customer c1 = new Customer("Devraj");     // create customer

        bank.openAccount(c1, 1001, 5000);         // open first account for customer
        bank.openAccount(c1, 1002, 9000);         // open second account for customer

        c1.viewBalance(1001);                     // view balance for existing account
        c1.viewBalance(9999);                     // try viewing balance for non-existing account
    }
}
