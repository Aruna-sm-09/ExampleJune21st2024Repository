package com.sgtest.Inheritance;
class vehicle1
{
    void model(String name)
    {
        System.out.println("The Vehicle Name: "+name);
    }
}
class FourWheeler2 extends vehicle1
{
    void Fourwheeler(String name)
    {
        System.out.println("The Extended model is "+name);
    }
}
class Electric3 extends vehicle1
{
    void charge(int price)
    {
        System.out.println("The Current Price is "+price);
    }
}
class Electriccar4 extends Electric3
{
    void auto(String name)
    {
        System.out.println("Auto piloted vehicle :"+name);
    }
}
public class HybridInherit {
    public static void main(String[] args) {
        Electriccar4 o=new Electriccar4();
        o.auto("Volkswagen's Autopilot");
        o.charge(35000);
        o.model("Volkswagen ID.6");
        FourWheeler2 o2=new FourWheeler2();
        o2.Fourwheeler("Volswagen e-golf");
        o2.model("Volswagen ID.8");


    }
}
