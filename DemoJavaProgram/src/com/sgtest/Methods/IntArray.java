package com.sgtest.Methods;
class Int4X4
{
    void IntArr(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            if((i==2)||(i==3))
            {
                for (int j = 0; j < a[i].length; j++)
                {
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
public class IntArray {
    public static void main(String[] args) {
        Int4X4 al=new Int4X4();
        al.IntArr(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}});
    }
}
