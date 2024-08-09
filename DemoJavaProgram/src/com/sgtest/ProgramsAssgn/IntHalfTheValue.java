package com.sgtest.ProgramsAssgn;
class IntHalf
{
    IntHalf(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                int x=(a[i][j])/2;
                System.out.println("Half of the Values");
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
public class IntHalfTheValue {
    public static void main(String[] args) {
        IntHalf h=new IntHalf(new int[][]{{10,20,30},{40,50,60},{70,80,90}});
    }
}
