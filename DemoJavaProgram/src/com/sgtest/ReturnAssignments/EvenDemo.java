package com.sgtest.ReturnAssignments;
class Even
{
    int[] getevenNum(int even[])
    {
        return even;
    }
}
public class EvenDemo
{
    public static void main(String[] args)
    {
        Even o=new Even();
        int[] e={10,12,14,16,18,20};
        int [] en=o.getevenNum(e);
        System.out.print("Even Numbers from 10-20 are:");
        for(int v:en)
        {
            System.out.print(v+" ");
        }

    }

}
