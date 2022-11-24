package org.example;
import java.util.Scanner;
public class SavingAccount implements Account{
    double balance;
    SavingAccount(double balance){
        this.balance=balance;
    }
    Scanner sc=new Scanner(System.in);
    @Override
    public void deposit(double amount) {
        balance=balance+amount;

    }

    @Override
    public void withdraw(double amount) {
        balance=balance-amount;

    }

    @Override
    public String getDetails() {
        return "Saving Account Balance: "+balance;
    }
}
