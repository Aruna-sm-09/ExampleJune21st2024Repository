package com.sgtest.ReturnDemo;
class mat
{
    int[][] getdifmatrix(int a[][],int b[][])
    {
        int s[][]=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                s[i][j]=a[i][j]-b[i][j];
            }
        }
        return s;
    }
}
public class practise12 {
    public static void main(String[] args) {
        mat o=new mat();
        int a[][]={{5,9},{10,8}};
        int b[][]={{4,5},{2,4}};
        int x[][]=o.getdifmatrix(a,b);
        for(int hh[]:x)
        {
            for(int kk:hh)
            {
                System.out.print(kk+" ");
            }
            System.out.println();
        }

    }
}
