package com.sgtest.ProgramsAssgn;
class Int2dTo1d
{
    Int2dTo1d(int a[][])
    {
        int r=a.length;
        int c=a[0].length;
        int oneD[]=new int[r*c];
        int index=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
             oneD[index]=a[i][j];
             index++;
            }
        }
        /*for(int kk:oneD)
        {
            System.out.print(kk+" ");
        }*/
        for(int z=0;z<oneD.length;z++)
        {
            System.out.print(oneD[z]+" ");
        }
    }
}

public class T2D_1DArray {
    public static void main(String[] args) {
        Int2dTo1d obj=new Int2dTo1d(new int[][]{{11,12,13},{14,15,16}});
    }
}
