//package org.todayTest_09_12_22;
//
//public class BankDetails implements Runnable{
//    private String accNo;
//    private String name;
//    private String acc_type;
//    private double balance;
//    public void threadCalculation(String threadName) {
//        this.threadName = threadName;
//        t= new Thread(this,this.threadName);
//        System.out.println("Created Thread - "+t);
//        t.start();
//    }
//    public BankDetails(){
//
//    }
//
//
//    public BankDetails(String accNo, String name, String acc_type, double balance) {
//        this.accNo = accNo;
//        this.name = name;
//        this.acc_type = acc_type;
//        this.balance = balance;
//    }
//    public void AccOpen(String accNo, String name, String acc_type, double balance) {
//        this.accNo = accNo;
//        this.name = name;
//        this.acc_type = acc_type;
//        this.balance = balance;
//        System.out.println("Account is Created Successfully with :-");
//        System.out.println("Account No. "+accNo+" Account Holder Name:- "+name+" Account Type:- "+acc_type+" Opening Balance :- "+balance);
//    }
//
//
//    public String getAccNo() {
//        return accNo;
//    }
//
//    public void setAccNo(String accNo) {
//        this.accNo = accNo;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAcc_type() {
//        return acc_type;
//    }
//
//    public void setAcc_type(String acc_type) {
//        this.acc_type = acc_type;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    @Override
//    public void run() {
//
//    }
//}
