package com.sgtest.overloading;
class Wholesaler1
{
    Wholesaler1(String wname,String type,String loc)
    {
        System.out.println("wname:"+wname);
        System.out.println("Type of Shop:"+type);
        System.out.println("Location:"+loc);
    }
    Wholesaler1(int pno,int pin)
    {
        System.out.println("Contact Number:"+pno);
        System.out.println("Pincode:"+pin);
    }
}

public class Wholesaler {
    public static void main(String[] args) {
        Wholesaler1 w1=new Wholesaler1("Ravi Stores","Textile","Bidar");
        Wholesaler1 w2=new Wholesaler1(765256980,518567);
    }
}
