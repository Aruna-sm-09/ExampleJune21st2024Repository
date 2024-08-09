package com.sgtest.Methods;
class Count
{
    void Count200_400()
    {
        int count=0;
        for(int i=200;i<=400;i++)
        {
            if((i%2==0)&&(i%4==0)&&(i%6==0))
            {
                count++;
            }
        }
        System.out.println("The Count of Numbers Divisible by 2,4 & 6 is "+count);
    }
}
public class CountDivBy2_4_6 {
    public static void main(String[] args) {
        Count cn=new Count();
        cn.Count200_400();
    }
}
