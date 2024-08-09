package com.sgtest.ReturnDemo;

class LaptopPrice
{
    int getprice(int cost)
    {
        return cost;
    }
}
public class PriceDemo {
    public static void main(String[] args) {
        LaptopPrice l=new LaptopPrice();
        int c=l.getprice(140000);
        System.out.println("The Price of Laptop is "+c);
    }

}
