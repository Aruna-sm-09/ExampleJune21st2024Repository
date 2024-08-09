package com.sgtest.ReturnDemo;
class demo7
{
    int[][] getcharele(char ch[][])
    {
        int x[][]=new int[ch.length][ch[0].length];
        for(int i=0;i<ch.length;i++)
        {
            for(int j=0;j<ch[i].length;j++)
            {
                 x[i][j]= ch[i][j];
            }
        }
        return x;
    }
}
public class practise7 {
    public static void main(String[] args) {
        demo7 o=new demo7();
        char bh[][]={{'A','W','B'},{'K','L','M'},{'N','O','D'}};
        int z[][]=o.getcharele(bh);
        for(int v[]:z)
        {
            for(int kk:v)
            {
                System.out.print(kk+" ");
            }
            System.out.println();
        }
    }
}

