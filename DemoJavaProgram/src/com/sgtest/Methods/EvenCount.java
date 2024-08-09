package com.sgtest.Methods;
class counteven1_500
{
    void Count()
    {
        int count=0;
        for(int i=1;i<=500;i++)
        {
            if(i%2==0)
            {
                count=count+1;
            }
        }
        System.out.println("The count of Even Numbers(1-500):"+count);
    }
}
public class EvenCount {
    public static void main(String[] args) {
        counteven1_500 ce=new counteven1_500();
       ce.Count();
    }
}
