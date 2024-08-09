package com.sgtest.ReturnDemo;
class demop
{
    int getprime(int num)
    {
        int prime=1;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                prime++;
                break;
            }

        }
        return prime;
    }
    void pm()
    {
        for(int i=1;i<=50;i++)
        {
            if(getprime(i)==1)
            {
                System.out.println(i);
            }
        }
    }
}
public class practiseprime {
    public static void main(String[] args) {
        demop o=new demop();
        o.pm();
    }
}
