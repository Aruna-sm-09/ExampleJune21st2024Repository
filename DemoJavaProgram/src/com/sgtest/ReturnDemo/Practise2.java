package com.sgtest.ReturnDemo;

import com.sgtest.Methods.SquareSum;
import org.w3c.dom.ls.LSOutput;

class demo2
{
    int getsumsqr()
    {
        int sqr=0,sum=0;
        for(int i=1;i<=10;i++)
        {
            sqr=i*i;
            sum=sum+sqr;
        }
        return sum;
    }
}
public class Practise2 {
    public static void main(String[] args) {
        demo2 o=new demo2();
        int SquareSum=o.getsumsqr();
        System.out.println(SquareSum);
    }
}
