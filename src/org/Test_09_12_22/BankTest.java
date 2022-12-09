package org.Test_09_12_22;

public class BankTest {
    public static void main(String[] args){
        System.out.println("Welcome to Lena Dena Bank!");
        new BankFunction("OPEN");
        new BankFunction("WITHDRAW");
        new BankFunction("DEPOSIT");
        new BankFunction("CLOSE");

        try{

            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
