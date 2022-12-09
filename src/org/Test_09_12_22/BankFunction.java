package org.Test_09_12_22;
import java.util.Scanner;
public class BankFunction implements Runnable{
    String Result;
    Thread banking;

    public BankFunction(String Result) {
        this.Result = Result;

        banking = new Thread(this, this.Result);
        banking.start();

    }
    @Override
    public synchronized void  run() {
        if (banking.getName() == "OPEN") {

            System.out.println("Account is Creating:-");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Account No. for creation:-");
            String accN=sc.next();
            System.out.println("Enter Account Holder Name:-");
            String accName= sc.next();
            System.out.println("Enter Account type:- ");
            String accType=sc.next();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Account is created Successfully with ");
            System.out.println("Account Number:- "+accN+"Account NAME- "+ accName+" Account Type "+accType);
            banking.notifyAll();


        }
        else if(banking.getName()=="DEPOSIT"){

            Scanner sc=new Scanner(System.in);
            double balance =1000;
            System.out.println("Enter Account number for deposit");
            String accN=sc.next();
            System.out.println("Enter Account Holder Name:-");
            String accName= sc.next();
            System.out.println("Your Current balance is "+balance);
            System.out.println("Enter Amount for deposit");
            double bal=sc.nextInt();
            balance=balance+bal;
            System.out.println("Depositing in account:--");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Deposited");
            System.out.println("Account Balance after deposit "+balance);
            banking.notifyAll();

        }
        else if(banking.getName()=="WITHDRAW"){


            Scanner sc=new Scanner(System.in);
            double balance =999999999;
            System.out.println("Enter Account number for WITHDRAW");
            String accN=sc.next();
            System.out.println("Enter Account Holder Name:-");
            String accName= sc.next();
            System.out.println("Your Current balance is "+balance);
            System.out.println("Enter Amount for WITHDRAW");
            double bal=sc.nextInt();
            balance=balance-bal;
            System.out.println("Withdrawing from account:--");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Withdraw successful");
            System.out.println("Account Balance after withdraw "+balance);
            banking.notifyAll();
        } else if (banking.getName()=="CLOSE") {


            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Account number for CLOSE");
            String accN=sc.next();
            System.out.println("Enter Account Holder Name:-");
            String accName= sc.next();
            System.out.println("Account Number "+accN +" of "+accName+" is now Closed. Thank You!");
            banking.notifyAll();

        }

    }
}
