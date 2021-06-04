package com.company;
/**
 * this class is for creating a CommercialClient
 * @auther anas
 * @version 1.00 2021/4/28
 */
public class CommercialClient extends Client {

    private int commercialID;
    public static int commercialcounter=0;
    /**
     * the class constructor  assign given values to name ,address, account ,commercialID and phone
     * @param name  the value to set the name data field to
     * @param address  the value to set the address data field to
     * @param phone  the value to set the phone data field to
     * @param account the value to set the account object data field to
     */
    public CommercialClient(String name,String address,String phone,Account account){
        super(name,"000000000000",address,phone,account);
        commercialID =++commercialcounter;
    }
    /**
     * the setCommercialID method assign the given value to commercialID
     * @param commercialID  the value is to set the commercialID data field to
     */
    public void setCommercialID(int commercialID){
        this.commercialID=commercialID;
    }
    /**
     * the getCommercialID method return the value of commercialID
     * @return  the value of commercialID
     */
    public int getCommercialID(){
        return commercialID;
    }
    /**
     * the toString method show the information
     * @return  string of CommercialClient information
     */
    @Override
    public String toString() {
        return "CommercialClient{" +
                "commercialID=" + commercialID +"name='" + getName() + '\'' +
                ", nationalID=" + getNationalID() +
                ", address='" + getAddress() + '\'' +
                ", phone=" + getPhone() +
                ", account=" + getaccount()+
                '}';
    }
}
