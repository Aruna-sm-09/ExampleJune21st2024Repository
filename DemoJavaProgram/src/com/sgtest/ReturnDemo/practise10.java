package com.sgtest.ReturnDemo;
class demo11
{
    int getcountdivby246()
    {
        int count=0;
        for(int i=200;i<=400;i++)
        {
            if((i%2==0)&&(i%4==0)&&(i%6==0))
            {
                count++;
            }
        }
        return count;
    }
}
public class practise10 {
    public static void main(String[] args) {
        demo11 o=new demo11();
        int no=o.getcountdivby246();
        System.out.println("The count is :"+no);
    }
}
