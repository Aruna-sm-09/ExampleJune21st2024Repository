package com.sgtest.ReturnDemo;
class demo5
{
    int[] getfrombyte(byte[] a)
    {
       int ab[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            ab[i]=a[i];
        }
       return ab;
    }

}
public class practise5 {
    public static void main(String[] args) {
        demo5 o=new demo5();
        byte z[]={10,20,30,40};
        int[] b =o.getfrombyte(z);
        for(int kk:b)
        {
            System.out.println(kk);
        }
    }

}
