package com.example.drew.mybank;

/**
 * Created by drew on 1/18/15.
 */
public class BankAccount {
    private double mBalance;
    public static final double OVERDRAFT_FEE = 30;

    public void withdraw(double amount){
        mBalance -= amount;
        if (mBalance < 0) {
            mBalance -= OVERDRAFT_FEE;
            
        }

    }

    public void deposit(double amount){
        mBalance += amount;

    }

    public double getBalance(){
        return mBalance;
    }
}
