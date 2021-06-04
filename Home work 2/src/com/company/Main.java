package com.company;

import java.util.Scanner;

/**
 * this is just a demo for testing bank system
 */
public class Main {
     public static int accountcounter=0;
     public static void main(String[] args) {
    Bank bank =new Bank("alex","Giza",01110);
    while (true){
        System.out.println("Are you new client?");
        Scanner cin=new Scanner(System.in);
        String option =cin.next();
        if(option.equalsIgnoreCase("yes")){
            System.out.println("pleas enter your name");
            String name =cin.next();

            System.out.println("pleas enter your phone");
            String phone =cin.next();
            System.out.println("pleas enter your address");
            String address =cin.next();
            System.out.println("Are you need to be commercialclient?");
            String result =cin.next();
            System.out.println("please enter your first balance");
            int balance=cin.nextInt();
            accountcounter++;
            if (result.equalsIgnoreCase("yes")){
                System.out.println("Are you need to create special account?");
                String special =cin.next();
                Account account=null;
                Client client=null;
                if (special.equalsIgnoreCase("yes")){
                     account =new SpecialAccount(balance,accountcounter);
                     client=new CommercialClient(name,address,phone,account);
                    bank.atClient(client);
                }
                else {
                     account =new Account(balance,accountcounter);
                     client=new CommercialClient(name,address,phone,account);
                    bank.atClient(client);
                }


            }
            else {
                System.out.println("please enter your nationalID");
                String national = cin.next();
                System.out.println("Are you need to create special account?");
                String special =cin.next();

                if (special.equalsIgnoreCase("yes")){
                    Account acount =new SpecialAccount(balance,accountcounter);
                    Client client=new Client(name,national,address,phone,acount);
                    bank.atClient(client);
                }
                else {
                    Account account =new Account(balance,accountcounter);
                    Client client=new Client(name,national,address,phone,account);
                    bank.atClient(client);
            }
        }

    }
        else {
            System.out.println("please enter your account number");
            int index=0 ;
            int clint = cin.nextInt();
            System.out.println("do you need to withdraw or deposit or enquiry");
            String withdraw=cin.next();
            Account account=null ;
            Client client=null;

            for (int i=0;i<bank.accountarr.size();i++) {
                 account =bank.accountarr.get(i);
                 client=bank.clientarr.get(i);
                if (account.getAccountnumber()==clint) {
                   index=i;
                }}
            if (withdraw.equalsIgnoreCase("withdraw")){
                System.out.println("how much money do you need?");
                int money=cin.nextInt();
                account.withdraw(money);
                client.setAccount(account);
                bank.accountarr.set(index,account);
                bank.clientarr.set(index,client);

            }
            else if (withdraw.equalsIgnoreCase("deposit")){
                System.out.println("how much money you need to add?");
                int money=cin.nextInt();
                account.deposit(money);
                client.setAccount(account);
                bank.accountarr.set(index,account);
                bank.clientarr.set(index,client);

            }
            else if(withdraw.equalsIgnoreCase("enquiry")){
                System.out.println(client.toString());
            }
        }
}}}
