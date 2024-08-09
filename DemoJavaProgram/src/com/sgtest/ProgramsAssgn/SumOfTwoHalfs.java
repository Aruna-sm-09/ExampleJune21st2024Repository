package com.sgtest.ProgramsAssgn;

import org.w3c.dom.ls.LSOutput;

class sum
{
    void addition(int a[])
    {
        int sum1=0,sum=0,sum2=0;
        for(int i=0;i<(a.length/2);i++)
        {
            sum1=sum1+a[i];
        }
        for(int j=a.length/2;j<a.length;j++)
        {
            sum2=sum2+a[j];
        }
        sum=sum1+sum2;
        System.out.println("First Half sum:"+sum1);
        System.out.println("Second Half sum:"+sum2);
        System.out.println("Addition of first and second half :"+sum);
    }

}
public class SumOfTwoHalfs {
    public static void main(String[] args) {
        sum s=new sum();
        s.addition(new int[]{1,2,3,4,5,6});
    }

}
