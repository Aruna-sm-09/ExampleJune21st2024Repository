package com.sgtest.ReturnDemo;

import org.w3c.dom.ls.LSOutput;

class demo8
{
    String gettables()
    {
        String str="";
        return str;
    }
}
public class practise8 {
    public static void main(String[] args) {
        demo8 o=new demo8();
        String tables=o.gettables();
        for(int i=1;i<=20;i++)
        {
            for(int j=1;j<=10;j++)
            {
               String str=i+"*"+j+"="+i*j;

                System.out.println(str);
            }
        }

    }

}
