package com.sgtest.ProgramsAssgn;
class DoubleRev
{
    DoubleRev(double d[][])
    {
        for(int i=d.length-1;i>=0;i--)
        {
            for(int j=d[i].length-1;j>=0;j--)
            {
                System.out.print(d[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
public class DoubleArray {
    public static void main(String[] args) {
        DoubleRev dr=new DoubleRev(new double[][]{{10.2,11.3,14.6},{12.5,2.6,18.1},{9.24,17.6,16.2}});
    }
}
