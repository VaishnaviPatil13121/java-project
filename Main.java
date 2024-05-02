import java.lang.*;
import java.util.*;
 class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;     }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}


 class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    
    public void deposit(double amount) {
        super.deposit(amount + (amount * interestRate));
    }

   }


 class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    
    public boolean withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            return true;
        }
        return false; 
    }

    
}


public class Main {
    public static void main(String[] args) {
        
        SavingsAccount savingsAccount = new SavingsAccount("SA123456", 1000, 0.05);
        savingsAccount.deposit(500);
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        
        CheckingAccount checkingAccount = new CheckingAccount("CA123456", 2000, 500);
        checkingAccount.withdraw(2500);
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
    }
}


