package com.company;
import java.util.ArrayList;

/**
 * this class is for creating a Bank
 * @auther anas
 * @version 1.00 2021/4/28
 */
public class Bank {
    private String name;
    private String address;
    private int phone;
    public ArrayList<Client> clientarr=new ArrayList<Client>();
    public ArrayList<Account> accountarr=new ArrayList<Account>();

    /**
     * the class constructor  assign given values to name ,address and phone
     * @param name  the value to set the name data field to
     * @param address  the value to set the address data field to
     * @param phone  the value to set the phone data field to
     */
    public Bank(String name,String address,int phone){
        this.name=name;
        this.address=address;
        this.phone=phone;
    }

    /**
     * the setName method assign the given value to name
     * @param name  the value is to set the name data field to
     */
    public void setName(String name){
        this.name=name;
    }
    /**
     * the getName method return the value of name
     * @return  the value of name
     */
    public String getName(){
        return name;
    }
    /**
     * the setAddress method assign the given value to address
     * @param address  the value is to set the address data field to
     */
    public void setAddress(String address){
        this.address=address;
    }
    /**
     * the getAddress method return the value of address
     * @return  the value of address
     */
    public String getAddress(){
        return address;
    }
    /**
     * the setPhone method assign the given value to phone
     * @param phone  the value is to set the phone data field to
     */
    public void setPhone(int phone){
        this.phone=phone;
    }
    /**
     * the getPhone method return the value of phone
     * @return  the value of phone
     */
    public int getPhone(){
        return phone;
    }

    /**
     * the atClient method is to add client and account in the arraylist
     * @param client the value of client object will be added in the array list
     */
    public void atClient (Client client) {
        clientarr.add(client);
        accountarr.add(client.getaccount());
    }

    /**
     * the printClient method is to print client information
     * @param accountnumber  the value use to search for the account
     * @return the value of the client object
     */
    public Client printclient(int accountnumber) {
        for (int i=0;i<accountarr.size();i++) {
        Account account =accountarr.get(i);
        if (account.getAccountnumber()==accountnumber) {
        return clientarr.get(i);
        }}
        return null;
        }
}

