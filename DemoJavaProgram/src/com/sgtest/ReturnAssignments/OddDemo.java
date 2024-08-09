package com.sgtest.ReturnAssignments;
class Odd
{
    int[] getodd(int oddnum[])
    {
        return oddnum;
    }

}
public class OddDemo {
    public static void main(String[] args) {
        Odd o=new Odd();
        int x[]={9,7,5,3,1};
        int v[]=o.getodd(x);
        System.out.println("Odd Numbers From 10-1 are :");
        for(int k:v)
        {
            System.out.print(k+" ");
        }

    }
}
