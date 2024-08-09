package com.sgtest.ReturnAssignments;
class ArrayHalf
{
    double[] getSecHalf(double d[])
    {
        double x[]=new double[d.length/2];
        int z=0;
        for(int i=d.length/2;i<d.length;i++)
        {
            x[z]=d[i];
            z++;
        }
        return x;
    }

}
public class SecondHalf1D {
    public static void main(String[] args) {
        ArrayHalf o=new ArrayHalf();
        double a[]={11.2,12.5,14.5,16.8,19.2,20.4};
        double y[]=o.getSecHalf(a);
        for(double kk:y)
        {
            System.out.print(kk+" ");
        }
    }
}
