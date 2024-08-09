package com.sgtest.ReturnAssignments;
class FirstCol2D
{
    int[] getColEle(int g[][])
    {
        int[] c1=new int [g.length];
        for(int i=0;i<g.length;i++)
        {
            c1[i]=g[i][0];
        }
        return c1;
    }
}
public class Firstcol {
    public static void main(String[] args) {
        FirstCol2D o = new FirstCol2D();
        int[][] x = {{12, 14, 15}, {16, 17, 18}, {19, 20, 21}};
        int[] p = o.getColEle(x);
        for (int k : p)
        {
            System.out.println(k + " ");
        }
    }
}

