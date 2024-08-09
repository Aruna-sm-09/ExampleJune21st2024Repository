package com.sgtest.ReturnAssignments;
class Matrix
{
    int[][] addMat(int m[][],int n[][])
    {
        int b[][]=new int[m.length][m[0].length];
        //int x=0,y=0;
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[i].length;j++)
            {
                b[i][j]=m[i][j]+n[i][j];
            }
        }
        return b;
    }
}
public class AddMatrix {
    public static void main(String[] args) {
        Matrix o=new Matrix();
        int m[][]={{1,2},{3,4}};
        int n[][]={{100,200},{300,400}};
        int z[][]=o.addMat(m,n);
        for(int[]val:z)
        {
            for(int kk:val)
            {
                System.out.print(kk+" ");
            }
            System.out.println();
        }
    }
}
