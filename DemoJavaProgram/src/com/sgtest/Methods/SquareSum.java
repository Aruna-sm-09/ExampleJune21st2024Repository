package com.sgtest.Methods;
class SqSum
{
    void SS()
    {
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            int sqr=i*i;
            sum=sum+sqr;
        }
        System.out.println("The sum of Square(1-10):"+sum);
    }
}
public class SquareSum {
    public static void main(String[] args) {
        SqSum s1=new SqSum();
        s1.SS();

    }
}
