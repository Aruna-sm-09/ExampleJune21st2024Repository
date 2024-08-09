package com.sgtest.overloading;
class Insurance
{

    Insurance(int id,int pnum,int amount)
    {
        System.out.println("Insurance ID :" + id);
        System.out.println("Policy Number:" + pnum);
        System.out.println("Insurance Amount:" + amount);
    }

    Insurance(String type,String provider,String pholder ) {
        System.out.println("Insurance Provider :" + provider);
        System.out.println("Type :" + type);
        System.out.println("Policy Holder :" + pholder);
    }
}
public class Insurances {
    public static void main(String[] args) {
        Insurance r1=new Insurance(1234,52,120500);
        Insurance r2=new Insurance("ABC Insurance","Health","John Smith");


    }
}
