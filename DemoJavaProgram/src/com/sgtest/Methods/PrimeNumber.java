package com.sgtest.Methods;
class Prime
{
    void primeno()
    {
        System.out.println("Prime Numbers Between 1-50 :");

        for(int i=2;i<=50;i++)
        {
            int p=0;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    p++;
                    break;
                }
            }
            if(p==0)
            {
                System.out.println(i);
            }
        }
    }
}

public class PrimeNumber {
    public static void main(String[] args) {
        Prime p=new Prime();
        p.primeno();
    }
}
