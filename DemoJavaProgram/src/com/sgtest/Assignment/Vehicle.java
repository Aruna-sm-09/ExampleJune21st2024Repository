package com.sgtest.Assignment;
class Wheeler2
{
    String model;
    String owner;
    int year;
    String Reg_no;
    int price;
}
class Wheeler4
{
    String model;
    String owner;
    int year;
    String Reg_no;
    int price;

}
class HeavyVehicles {
    String model;
    String owner;
    int year;
    String Reg_no;
    int price;
}
public class Vehicle {
    public static void main(String[] args) {
        Wheeler2 obj2=new Wheeler2();
        obj2.model="Honda";
        obj2.owner="Suresh";
        obj2.year= 2020;
        obj2.Reg_no="KA 36 RA 1234";
        obj2.price= 80000;
        System.out.println("Details of Two Wheeler");
        System.out.println("Name of the Model:"+obj2.model);
        System.out.println("Owner:"+obj2.owner);
        System.out.println("Year:"+obj2.year);
        System.out.println("Registration Number:"+obj2.Reg_no);
        System.out.println("Price of the Model:"+obj2.price);
        System.out.println("-------------------------------------------");

        Wheeler4 obj4=new Wheeler4();
        obj4.model="Toyota Innova";
        obj4.owner="Mahendar";
        obj4.year= 2016;
        obj4.Reg_no="KA 41 AD 9999";
        obj4.price= 5470000;
        System.out.println("Details of Four Wheeler");
        System.out.println("Name of the Model:"+obj4.model);
        System.out.println("Owner:"+obj4.owner);
        System.out.println("Year:"+obj4.year);
        System.out.println("Registration Number:"+obj4.Reg_no);
        System.out.println("Price of the Model:"+obj4.price);
        System.out.println("-------------------------------------------");

        HeavyVehicles obj6=new HeavyVehicles();
        obj6.model="TATA Motors";
        obj6.owner="Amaresh";
        obj6.year= 2023;
        obj6.Reg_no="PY 28 MA 8181";
        obj6.price= 6500000;
        System.out.println("Details of Heavy Vehicle");
        System.out.println("Name of the Model:"+obj6.model);
        System.out.println("Owner:"+obj6.owner);
        System.out.println("Year:"+obj6.year);
        System.out.println("Registration Number:"+obj6.Reg_no);
        System.out.println("Price of the Model:"+obj6.price);
        System.out.println("-------------------------------------------");
    }
}
