package com.sgtest.Methods;
class PrimeCount
{
    void primecount1()
    {
        int count=0;
        for(int i=2;i<=100;i++)
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
                count++;
            }
        }
        System.out.println("The Count of Prime Numbers Between 1-100 : "+count);
    }
}
public class CountPrimeNumber {
    public static void main(String[] args) {
        PrimeCount pc=new PrimeCount();
        pc.primecount1();
    }
}
