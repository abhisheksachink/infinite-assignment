//package org.todayTest_09_12_22;
//
//public class BankFunction {
//    BankDetails bd= new BankDetails();
//    public void AccOpen(String accNo, String name, String acc_type, double balance) {
//        bd.setAccNo(accNo);
//        bd.setName(name);
//        bd.setAcc_type(acc_type);
//        bd.setBalance(balance);
//        System.out.println("Account is Created Successfully with :-");
//        System.out.println("Account No. "+bd.getAccNo()+" Account Holder Name:- "
//                +bd.getName()+" Account Type:- "+bd.getAcc_type()+" Opening Balance :- "+bd.getBalance());
//    }
//    public double deposit(double bal){
//        double balance= bal+ bd.getBalance();
//        return balance;
//    }
//    public double withdraw(double bal){
//        double balance;
//        if(bd.getBalance()>bal){
//        balance = bd.getBalance()-bal;
//        return balance;}
//        else return-1;
//
//    }
//    public void closeAcc(String acc_no,String acc_name,String acc_type){
//        System.out.println("The Account is closed with the following details:-");
//        System.out.println("Account Number:- "+acc_no);
//        System.out.println("Account Holder Name:- "+acc_name);
//        System.out.println("Account Holder Name:- "+acc_type);
//
//    }
//
//
//}
