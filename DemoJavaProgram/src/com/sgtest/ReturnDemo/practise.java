package com.sgtest.ReturnDemo;
class demo6
{
    int[][] getdouble(double a[][])
    {
        int bg[][]=new int[a.length][a[0].length];
                for(int i=0;i<a.length;i++)
                {
                    for(int j=0;j<a[i].length;j++)
                    {
                        bg[i][j]=(int)a[i][j];
                    }
                }
                 return bg;
        }
    }


public class practise {
    public static void main(String[] args) {
        demo6 o=new demo6();
        double x[][]={{10.5,12.6,14.6},{18.6,12.3,44.3},{58.2,63.2,14.3}};
        int v[][]=o.getdouble(x);
        for(int h[]:v)
        {
            for(int kk:h)
            {
                System.out.print(kk+" ");
            }
            System.out.println();
        }

    }
}
