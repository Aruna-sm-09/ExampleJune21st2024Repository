package com.sgtest.ReturnDemo;
class demo3
{
    double[] getfirstrow(double d[][])
    {
        double r1[]=new double [d[0].length];
        int i=0;
        for(int j=0;j<d[i].length;j++)
        {
            r1[j]=d[0][j];
        }

        return r1;
    }
}
public class practise3 {
    public static void main(String[] args) {
        demo3 o=new demo3();
        double x[][]={{10.2,12.4,13.6},{14.2,12.6,11.4},{54.1,63.4,12.8}};
        double r[]=o.getfirstrow(x);
        System.out.println("The First Row Values Are:");
        for(double vv:r)
        {
            System.out.print(vv+" ");
        }

    }
}
