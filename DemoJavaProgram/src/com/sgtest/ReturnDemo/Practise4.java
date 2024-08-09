package com.sgtest.ReturnDemo;
class demo4
{
    int getevencount()
    {
        int count=0;
        for(int i=1;i<=500;i++)
        {
            if(i%2==0)
            {
                count=count+1;
            }
        }
        return count;
    }
}
public class Practise4 {
    public static void main(String[] args) {
        demo4 o=new demo4();
        int c=o.getevencount();
        System.out.println("The Count of even Num btw 1-500 :"+c);
    }
}
