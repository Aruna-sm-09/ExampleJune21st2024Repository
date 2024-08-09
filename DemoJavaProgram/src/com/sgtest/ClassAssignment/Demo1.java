package com.sgtest.ClassAssignment;
class Restaurant
{
    String rname;
    String Owner;
    String Address;
    String phno;
    Restaurant()
    {
        rname="Green Hotel";
        Owner="Sumesh Reddy";
        Address="VV Mohalla,KRS road,Mysore-5110125";
        phno="+91 7060589680";
        System.out.println("Restaurant Details");
        System.out.println("Name of Restuarant:"+rname);
        System.out.println("Owner of Restaurant:"+Owner);
        System.out.println("Address of the Restaurant:"+Address);
        System.out.println("Contact No:"+phno);
        System.out.println("----------------------------------------------------");

    }
}
class FoodDelivery
{
    String appname="Zomato";
    String phno="+91 905264860";
    String Address="RR Nagar,4th Cross,";
    String Dperson="Shivu";
    FoodDelivery()
    {
        System.out.println("The Food Delivery App is "+appname);
        System.out.println("Contact No:"+phno);
        System.out.println("Address :"+ Address);
        System.out.println("Delivery Person:"+Dperson);
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Restaurant res=new Restaurant();
        FoodDelivery FD=new FoodDelivery();
    }

}

