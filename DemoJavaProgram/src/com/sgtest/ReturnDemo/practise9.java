package com.sgtest.ReturnDemo;
class demo9
{
    int[][] getrow(int a[][])
    {
        int x[][]=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
        {
            if((i==2) || (i==3))
            {
                for (int j = 0; j < a[i].length; j++)
                {
                    x[i][j]=a[i][j];
                }
            }
        }
        return x;
    }
}
public class practise9 {
    public static void main(String[] args) {
        demo9 o=new demo9();
        int c[][]={{1,2,3,4},{5,6,7,8},{9,1,2,5},{8,6,1,5}};
        int[][]n=o.getrow(c);
        for(int vv[]:n)
        {
            for(int kk:vv)
            {
                System.out.print(kk+" ");
            }
            System.out.println();
        }

    }
}
