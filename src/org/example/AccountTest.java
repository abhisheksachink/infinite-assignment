package org.example;
import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account Type");
        String accountType = sc.next();
        Account account=AccountFactory.getAccount(accountType);

        System.out.println("Enter 1: Deposit 2: Withdraw");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("Enter the amount for deposit");
            int depositAmnt=sc.nextInt();
            account.deposit(depositAmnt);
        }
        if(choice==2){
            System.out.println("Enter the amount for withdraw");
            int withdramnt=sc.nextInt();
            account.withdraw(withdramnt);
        }
        System.out.println(account.getDetails());

    }
}
