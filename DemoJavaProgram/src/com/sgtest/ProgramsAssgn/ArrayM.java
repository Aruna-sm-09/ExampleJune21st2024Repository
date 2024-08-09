package com.sgtest.ProgramsAssgn;
class Demo
{
    void Array(int a[])
    {
        System.out.println("First and Last Elements are");
        for(int i=0;i<a.length;i++)
        {
            if((i==0)||(i==(a.length-1)))
            {
                System.out.println(a[i]);
            }
        }
    }
}
public class ArrayM {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.Array(new int[]{10,20,30,40,50});
        d.Array(new int[] {1,2,3,4,5});
    }
}
