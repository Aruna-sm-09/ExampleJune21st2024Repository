package com.sgtest.Methods;
class DoubleArrayRev
{
    void RevRow(double a[][])
    {
        System.out.println("The First Row elements in Rev order:");
        for(int i=a.length-1;i>=0;i--)
        {
            if(i==0)
            {
                for (int j = a[i].length - 1; j >= 0; j--)
                {
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
public class Double2D {
    public static void main(String[] args) {
        DoubleArrayRev dr=new DoubleArrayRev();
        dr.RevRow(new double[][] {{11.2,12.1,13.4},{16.1,15.2,13.4},{16.2,17.6,18.9}});
    }
}
