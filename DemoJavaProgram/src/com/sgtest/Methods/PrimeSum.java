package com.sgtest.Methods;
class SumPrime
{
    void sum()
    {
        int sum=0;
        for(int i=200;i>=100;i--)
        {
            int p=0;
            for(int j=2;j<=i/2;j++)
            {
                if (i % j == 0)
                {
                    p++;
                    break;
                }
            }
            if (p == 0)
            {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
public class PrimeSum {
    public static void main(String[] args) {
        SumPrime sp=new SumPrime();
        sp.sum();

    }
}
