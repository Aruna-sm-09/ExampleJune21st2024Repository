package com.sgtest.Parameter;

import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;

class Shop
{
    int sid;
    String sname;
    String type;
    String owner;
    Shop(int sid,String sn,String type,String owner)
    {
        this.sid=sid;
        this.sname=sn;
        this.type=type;
        this.owner=owner;
        System.out.println("Shop ID:"+sid);
        System.out.println("Shop Name:"+sn);
        System.out.println("Shop type :"+type);
        System.out.println("Shop Owner:"+owner);
        System.out.println("-------------------------------------------------");

    }
}
class Purchase
{
    String pitem;
    String pdate;
    String pamt;
    Purchase(String pitem,String pdate,String pamt)
    {
        this.pitem=pitem;
        this.pdate=pdate;
        this.pamt=pamt;
        System.out.println("Purchased Item:"+pitem);
        System.out.println("Purchased on:"+pdate);
        System.out.println("Amount:"+pamt);
        System.out.println("-------------------------------------------------");

    }
}
class Distribute
{
    String Dname;
    String Ditem;
    String Ddate;
    Distribute(String dn,String ditem,String date)
    {
        this.Dname=dn;
        this.Ditem=ditem;
        this.Ddate=date;
        System.out.println("Distributor:"+dn);
        System.out.println("Distributed Item :"+ditem);
        System.out.println("Distributed on :"+date);

    }
}

public class Assignment2 {
    public static void main(String[] args) {
    Shop s1=new Shop(52,"Amareshwar Store","Provisional","Krishna");
    Purchase p1=new Purchase("Nike Shoes","21/11/2024","5000/-");
    Distribute d1=new Distribute("Ecart","Paavay Costume","12/02/2024");

    }

}
