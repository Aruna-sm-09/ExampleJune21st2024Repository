package com.sgtest.overloading;
class supplier1
{
    supplier1(int sid)
    {
        System.out.println("Supplier ID :"+sid);
    }
    supplier1(String sname,String address,String phno,String service)
    {
        System.out.println("Supplier Name :"+sname);
        System.out.println("Address :"+address);
        System.out.println("Contact No :"+phno);
        System.out.println("Service :"+service);
    }
}
public class Supplier {
    public static void main(String[] args) {
        supplier1 sl=new supplier1(125);
        supplier1 s2=new supplier1("Kiran Hardwares","#41, MainRoad,Raichur-584128","+81 5210342053","Office supplies");

    }
}
