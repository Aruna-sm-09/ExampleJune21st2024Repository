package com.sgtest.ReturnAssignments;
class doubleArray
{
    double [][] getdouble()
    {
        double a[][]={{1.2,2.5,3.6},{4.5,5.4,6.1}};
        return a;
    }
}
public class Double2D {
    public static void main(String[] args) {
        doubleArray o=new doubleArray();
        double n[][]=o.getdouble();
        for(double v[]:n)
        {
            for(double kk:v)
            {
                System.out.print(kk+" ");
            }
            System.out.println();
        }


    }
}
