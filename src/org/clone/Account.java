package org.clone;

public class Account implements Cloneable{

    public void dayTrans(int day){
        System.out.println("Nov"+day+"Trans");
    }
    public double deposit(double deposit){
        this.balance=balance+deposit;
        return balance;

    }
    public double withdraw(double withdraw){
        this.balance=balance-withdraw;
        return balance;

    }
    private int acctNumber;

    private String acctName;
    private double balance;

    public int getAcctNumber() {
        return acctNumber;
    }

    public void setAcctNumber(int acctNumber) {
        this.acctNumber = acctNumber;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();

    }
}
