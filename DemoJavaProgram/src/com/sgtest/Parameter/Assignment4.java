package com.sgtest.Parameter;
class Newspaper
{
    String Nwname;
    String lang;
    String price;
    String Date;
    Newspaper(String nw,String lang,String price,String date)
    {
        this.Nwname=nw;
        this.lang=lang;
        this.price=price;
        this.Date=date;
        System.out.println("Newspaper Name:" + nw);
        System.out.println("Published in :" + lang +" Languange");
        System.out.println("Cost per unit :" + price);
        System.out.println("Date :" + date);
        System.out.println("-------------------------------------------------");
    }
}
class Magazine
{
    String Mname;
    int mid;
    String price;
    String published;
    Magazine(String mn,int mid,String price,String date)
    {
        this.Mname=mn;
        this.mid=mid;
        this.price=price;
        this.published=date;
        System.out.println("Magazine Name:" + mn);
        System.out.println("Magazine ID:" + mid);
        System.out.println("Cost :" + price);
        System.out.println("Published on :" + date);
        System.out.println("-------------------------------------------------");

    }
}
class Comics
{
    String cname;
    int cid;
    String publisher;
    String date;
    Comics(String cn,int cid,String pub,String date)
    {
        this.cname=cn;
        this.cid=cid;
        this.publisher=pub;
        this.date=date;
        System.out.println("Comic Title:" + cn);
        System.out.println("comic ID:" + cid);
        System.out.println("Publisher :" + pub);
        System.out.println("Published on :" + date);
        System.out.println("-------------------------------------------------");

    }
}


public class Assignment4 {
    public static void main(String[] args) {
        Newspaper n1=new Newspaper("Suddibimba","Kannada","5/-","22-07-2024");
        Magazine m1=new Magazine("National Geographic",1234,"90","July 2023");
        Comics c1=new Comics("The Adventures of Superman",4325,"DC Comics","Feb 2023");
    }

}
