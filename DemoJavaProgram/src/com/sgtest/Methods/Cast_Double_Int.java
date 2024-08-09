package com.sgtest.Methods;
class Double_Int
{
    void DoubleToInt(double d[][])
    {
        int a[][]=new int[d.length][d[0].length];
        int x=0,y=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                 a[x][y]=(int) d[i][j];
                System.out.print(a[x][y]+" ");
            }
            System.out.println();
        }
    }
}
public class Cast_Double_Int {
    public static void main(String[] args) {
        Double_Int dl=new Double_Int();
        dl.DoubleToInt(new double[][]{{10.2,22.5,41.3},{51.2,26.6,32.1},{71.2,69.3,56.4}});

    }
}
