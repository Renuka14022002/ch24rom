package com.renu.account;

public class BankAccount {
    public double balance;

    public double getbalance() {
        return balance;
    }
    public void debit(double amount){
        System.out.println("debit method Started");
        if(amount < balance)
            balance = balance - amount;
        else
            System.out.println("Insufficient fund");
        System.out.println("debit method ended");
    }

    public void credit(double amount){
        System.out.println("Credit method Started");
        if(amount > 0)
            balance = balance + amount;
        else
            System.out.println("cannot credit the amount as amount is "+ amount);
        System.out.println("Credit method ended");

    }
}
