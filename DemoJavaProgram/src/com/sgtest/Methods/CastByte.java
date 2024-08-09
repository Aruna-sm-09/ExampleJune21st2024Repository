package com.sgtest.Methods;
class Byte_Int
{
    void byte_int(byte a[])
    {
        System.out.println("Byte to Int casted values");
        int b[]=new int[a.length];
        int x=0;
        for(int i=0;i<a.length;i++)
        {
            b[x]=a[i];
            System.out.print(b[x]+" ");
        }
    }
}
public class CastByte {
    public static void main(String[] args) {
        Byte_Int bs=new Byte_Int();
        bs.byte_int(new byte[] {10,20,30,40,50});

    }
}
