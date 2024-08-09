package com.sgtest.ProgramsAssgn;
class Demosum
{
    void sum(int a[])
    {
        int sum=0;
        for(int i=a.length/2;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
public class ArraySum {
    public static void main(String[] args) {
        Demosum ds=new Demosum();
        ds.sum(new int[] {10,20,30,40,50,60});
        ds.sum(new int[]{4,5,6,7});
    }
}
