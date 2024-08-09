package com.sgtest.Polymorphism;

import javax.print.attribute.standard.Media;

interface StatisticalOperator
{
    void operate(int data[]);

}
class Mean implements StatisticalOperator
{
    int sum=0;
    @Override
    public void operate(int [] data)
    {
      for(int i=0;i<data.length;i++)
      {
          sum=sum+data[i];
      }
        System.out.println("Mean Value is "+sum);
    }
}
class Median implements StatisticalOperator {

    @Override
    public void operate(int[] data)
    {
        int median=0;
        int middleIndex=data.length/2;
            if(data.length%2==0)
            {
               median=median+((data[middleIndex - 1] + data[middleIndex]) / 2);
                System.out.println("Median Value :"+median);
            }
            else {
               median=median+(data[middleIndex]);
                System.out.println("Median Value :"+median);
        }
    }
}

public class polyAssgn4 {
    public static void main(String[] args) {
       StatisticalOperator st=null;
        Mean mean=new Mean();
        Median median=new Median();
        int data[]={10,28,22,40,30};

        st=mean;
        st.operate(data);
        st=median;
        st.operate(data);

    }
}







//class Mode implements StatisticalOperator
//{
//    int count=0;
//    @Override
//    public void operate(int[] data) {
//        for(int i=0;i<data.length;i++)
//        {
//            if(data[i]=)
//        }
//    }
//}