package com.sgtest.Assignment;

class Wheeler2v
{
    String model;
    String owner;
    int year;
    String Reg_no;
    int price;
    Wheeler2v() {
        model = "Honda";
        owner = "Suresh";
        year = 2020;
        Reg_no = "KA 36 RA 1234";
        price = 80000;
        System.out.println("Details of Two Wheeler");
        System.out.println("Name of the Model:" + model);
        System.out.println("Owner:" + owner);
        System.out.println("Year:" + year);
        System.out.println("Registration Number:" + Reg_no);
        System.out.println("Price of the Model:" + price);
        System.out.println("-------------------------------------------");
    }
}
class Wheeler4v
{
    String model;
    String owner;
    int year;
    String Reg_no;
    int price;
    Wheeler4v() {
        model = "Toyota Innova";
        owner = "Mahendar";
        year = 2016;
        Reg_no = "KA 41 AD 9999";
        price = 5470000;
        System.out.println("Details of Four Wheeler");
        System.out.println("Name of the Model:" + model);
        System.out.println("Owner:" + owner);
        System.out.println("Year:" + year);
        System.out.println("Registration Number:" + Reg_no);
        System.out.println("Price of the Model:" + price);
        System.out.println("-------------------------------------------");
    }

}
class HeavyVehicles1 {
    String model;
    String owner;
    int year;
    String Reg_no;
    int price;

    HeavyVehicles1(){

    model="TATA Motors";
    owner="Amaresh";
    year=2023;
    Reg_no="PY 28 MA 8181";
    price=6500000;
        System.out.println("Details of Heavy Vehicle");
        System.out.println("Name of the Model:"+model);
        System.out.println("Owner:"+owner);
        System.out.println("Year:"+year);
        System.out.println("Registration Number:"+Reg_no);
        System.out.println("Price of the Model:"+price);
        System.out.println("-------------------------------------------");
}
}

public class NoArgs_Vehicle {
    public static void main(String[] args) {
        Wheeler2v obj2=new Wheeler2v();
        Wheeler4v obj4=new Wheeler4v();
        HeavyVehicles1 obj6=new HeavyVehicles1();

    }
}

