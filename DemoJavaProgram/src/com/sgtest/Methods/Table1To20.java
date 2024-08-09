package com.sgtest.Methods;
class Tables
{
    void alltab()
    {
        String str="";
        for(int i=1;i<=20;i++)
        {
            for(int j=1;j<=10;j++)
            {
                str=i+" * "+j+" = "+i*j;
                System.out.println(str);
            }
        }
    }
}
public class Table1To20 {
    public static void main(String[] args) {
        Tables t1=new Tables();
        t1.alltab();
    }
}
