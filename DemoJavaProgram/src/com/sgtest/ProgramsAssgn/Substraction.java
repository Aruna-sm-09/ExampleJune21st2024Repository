package com.sgtest.ProgramsAssgn;
class substractionMatrix
{
    substractionMatrix(int a[][],int b[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                int res=a[i][j]-b[i][j];
                System.out.print("Substraction of Two Matrix Result :"+res+" ");
            }
            System.out.println();
        }
    }
}
public class Substraction {
    public static void main(String[] args) {
        substractionMatrix sub=new substractionMatrix(new int[][]{{5,4,3},{6,7,8}},new int[][]{{1,2,1},{3,3,1}});
    }
}
