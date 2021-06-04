package com.company;
/**
 * this class is for creating a SpecialAccount
 * @auther anas
 * @version 1.00 2021/4/28
 */
public class SpecialAccount extends Account {
    /**
     * the class constructor assigns a given values to balance and account number
     * @param balance  the value to set the balance data field to
     * @param accountnumber  the value to set the accountnumber data field to
     */
    public SpecialAccount(int balance, int accountnumber) {
        super(balance, accountnumber);
    }
    /**
     * the withdraw method is to minus money from balance and balance can reach at maximum -1000
     * @param money  value will be used to minus
     */
    public void withdraw(int money){
        if ((getBalance()-money )>= -1000)
        {
           int count;
            count= getBalance()-money;
            setBalance(count);
        }
    }
}
