package com.example.drew.mybank;

/**
 * Created by drew on 1/18/15.
 */
public class BankAccount {
    private double balance;

    public void withdraw(double amount){
        balance -= amount;

    }

    public void deposit(double amount){
        balance += amount;

    }

    public double getBalance(){
        return balance;
    }
}
