package com.renu.runner;
import com.renu.savings.SavingAccount;
public class Runner {
    public static void main (String[] args){
        SavingAccount ref=new SavingAccount();
        SavingAccount.credit (10000.00);
        double closingbalance = ref + ;

        System.out.println("closing balance is" + closingbalance);
    }
}
