package com.company;
/**
 * this class is for creating a Client
 * @auther anas
 * @version 1.00 2021/4/28
 */
public class Client {
    private String name;
    private String nationalID;
    private String address;
    private String phone;
    private Account account;

    /**
     * the class constructor  assign given values to name ,address ,nationalID, account and phone
     * @param name  the value to set the name data field to
     * @param address  the value to set the address data field to
     * @param phone  the value to set the phone data field to
     * @param nationalID the value to set the nationalID data field to
     * @param account the value to set the account object data field to
     */
    public Client(String name, String nationalID, String address, String phone, Account account)
    {
        this.name=name;
        this.nationalID=nationalID;
        this.address=address;
        this.phone=phone;
        this.account=account;
    }
    /**
     * the toString method show the information
     * @return  string of client information
     */
    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", nationalID=" + nationalID +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", account=" + account +
                '}';
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
     * the setNationalID method assign the given value to nationalID
     * @param nationalID  the value is to set the nationalID data field to
     */
    public void setNationalID(String nationalID){
        this.nationalID=nationalID;
    }
    /**
     * the getNationalID method return the value of nationalID
     * @return  the value of nationalID
     */
    public String getNationalID(){
        return nationalID;
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
        this.name=name;
    }
    /**
     * the getPhone method return the value of phone
     * @return  the value of phone
     */
    public String getPhone(){
        return phone;
    }
    /**
     * the setAccount method assign the given value to account
     * @param account  the value is to set the account data field to
     */
    public void setAccount(Account account){
        this.account=account;
    }
    /**
     * the getAccount method return the value of account
     * @return  the value of account
     */
    public Account getaccount (){
        return account;
    }


}
