package com.sgtest.Stringassignments;

public class Pattern2 {
    public static void main(String[] args) {
        pattern1();
    }
    static void pattern1()
    {
        String s="PROGRAM";
        for(int i=s.length()-1;i>=0;i--)
        {
            for(int j=0;j<s.length()-i;j++)
            {
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }
        String sx="PROGRAM";
        for(int i=1;i<sx.length();i++)
        {
            for(int j=0;j<sx.length()-i;j++)
            {
                System.out.print(sx.charAt(j)+" ");
            }
            System.out.println();
        }
    }

}
