package com.sgtest.ProgramsAssgn;
class Transpose
{
    Transpose(int m[][])
    {
        int T[][]=new int[m.length][m[0].length];
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[i].length;j++)
            {
                T[i][j]=m[j][i];
                System.out.print(T[i][j]+" ");
            }
            System.out.println();
        }

    }
}

public class TransposeMatrix {
    public static void main(String[] args) {
        Transpose tm=new Transpose(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
}
