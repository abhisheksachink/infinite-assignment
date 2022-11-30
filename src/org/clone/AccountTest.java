package org.clone;
import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account Number");
        int acN=sc.nextInt();
        System.out.println("Enter Account Name");
        String acName=sc.next();
        System.out.println("Enter balance");
        double bal=sc.nextInt();
        Account Ac =new Account();
        Account Ac1=null;
        Account Ac2=null;
        Ac.dayTrans(21);
        Ac.setAcctNumber(acN);
        Ac.setAcctName(acName);
        Ac.setBalance(bal);
        System.out.println(Ac.getAcctName()+" "+Ac.getAcctNumber()+" "+Ac.getBalance());

        try{
            Ac1=(Account)Ac.clone();
            Ac1.deposit(500);
            Ac1.dayTrans(22);
            System.out.println(Ac1.getAcctName()+" "+Ac1.getAcctNumber()+" "+Ac1.getBalance());
            Ac2=(Account)Ac1.clone();
            //Ac2.deposit(100);
            Ac2.withdraw(40);
            Ac2.dayTrans(23);
            System.out.println(Ac2.getAcctName()+" "+Ac2.getAcctNumber()+" "+Ac2.getBalance());


        }
        catch (Exception e){
            e.printStackTrace();

        }


    }


}



//    Create an account class with fields like account number, account name
//        and balance and methods like deposit and withdraw. Need to create an
//        object which will represent a day's transaction let say "Nov20Trans"
//        you will then create 2 cloned objects that represent "Nov21Trans" and "Nov22Trans"