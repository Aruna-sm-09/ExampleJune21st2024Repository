package com.sgtest.ReturnAssignments;
class shortdemo
{
    short getsum(short s[][])
    {
        short sum=0;
        for(int i=0;i<s.length;i++)
        {
            for(int j=0;j<s[i].length;j++)
            {
                sum=(short) (sum+s[i][j]);
            }
        }
        return sum ;
    }
}
public class SumShortArray {
    public static void main(String[] args) {
        shortdemo o=new shortdemo();
        short x[][]={{40,50,60},{10,20,30},{70,80,90}};
        short z=o.getsum(x);
        System.out.println("The sum of all elements :"+z);

            }
}
