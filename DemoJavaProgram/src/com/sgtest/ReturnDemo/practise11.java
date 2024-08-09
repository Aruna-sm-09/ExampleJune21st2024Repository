package com.sgtest.ReturnDemo;

import org.w3c.dom.ls.LSOutput;

class transpose
{
    int[][] gettranpose(int a[][])
    {
        int t[][]=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                t[i][j]=a[j][i];
            }
        }
        return t;
    }
}
public class practise11 {
    public static void main(String[] args) {
        transpose o=new transpose();
        int a[][]={{11,22,33},{44,55,66},{77,88,99}};
        int x[][]=o.gettranpose(a);
        for(int cc[]:x)
        {
            for(int kk:cc)
            {
                System.out.print(kk+" ");
            }
            System.out.println();
        }

    }


}
