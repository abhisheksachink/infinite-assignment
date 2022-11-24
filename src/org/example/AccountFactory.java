package org.example;

public class AccountFactory {
    public static Account getAccount(String accountType){
        Account account=null;
        if(accountType.equalsIgnoreCase("savings")){
            account=new SavingAccount(1000);
        }
        else{
            account=new CheckingAccount(1000);

        }
        return account;

    }
}
