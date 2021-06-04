package com.company;

/**
 * this class is for creating an account
 * @auther omar
 * @version 1.00 2021/4/28
 */
public class Account {
    private int balance;
    private int accountnumber;

    /**
     * the withdraw method is to minus money from balance
     * @param money  value will be used to minus
     */
    public void withdraw(int money){
        if (balance-money>=0)
        {
        balance=balance-money;
        }
    }

    /**
     * the deposit method is to add money to the balance
     * @param money  value will be used to add
     */
    public void deposit(int money)
    {
    balance+=money;
    }

    /**
     * the class constructor assigns a given values to balance and account number
     * @param balance  the value to set the balance data field to
     * @param accountnumber  the value to set the accountnumber data field to
     */
    public Account(int balance, int accountnumber ) {
        this.balance = balance;
        this.accountnumber= accountnumber;
    }

    /**
     * the toString method show the information
     * @return  string of account information
     */
    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accountnumber=" + accountnumber +
                '}';
    }

    /**
     * the setBalance method assigns a given value to balance
     * @param balance  the value to set the balance data field to
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }

    /**
     * the getBalance method return the value of balance
     * @return  the value of balance
     */
    public int getBalance(){
        return balance;
    }
    /**
     * the setAccountnumber method assigns a given value to accountnumber
     * @param accountnumber the value to set the accountnumber data field to
     */
    public void setAccountnumber(int accountnumber) {
        this.balance = balance;
    }
    /**
     * the getAccountnumber method return the value of accountnumber
     * @return  the value of accountnumber
     */
    public int getAccountnumber(){
        return accountnumber;
    }}