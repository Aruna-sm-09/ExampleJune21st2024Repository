package com.sgtest.Methods;
class Chararray
{
    void chartoint(char ch[][])
    {
        int a[][]=new int[ch.length][ch[0].length];
        int x=0,y=0;
        for(int i=0;i<ch.length;i++)
        {
            for(int j=0;j<ch[i].length;j++)
            {
                a[x][y]=ch[i][j];
                System.out.print(a[x][y]+" ");
            }
            System.out.println();
        }
    }
}
public class Cast_Char_Int {
    public static void main(String[] args) {
        Chararray k=new Chararray();
        k.chartoint(new char[][]{{'A','B','C'},{'D','E','F'},{'G','H','I'}});
    }
}
