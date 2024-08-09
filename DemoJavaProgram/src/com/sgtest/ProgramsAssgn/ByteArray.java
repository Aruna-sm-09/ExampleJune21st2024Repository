package com.sgtest.ProgramsAssgn;
class ByteSum
{
    ByteSum(byte b[][])
    {
        byte sum=0;
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                sum= (byte) (sum+b[i][j]);
            }
        }
        System.out.println("The sum of Byte Array is "+ sum);
    }
}
public class ByteArray {
    public static void main(String[] args) {
        ByteSum bs=new ByteSum(new byte[][] {{10,11,12},{13,14,15},{1,2,3}});
    }
}
