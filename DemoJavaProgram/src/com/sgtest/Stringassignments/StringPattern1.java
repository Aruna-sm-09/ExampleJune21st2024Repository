package com.sgtest.Stringassignments;
//Print Pattern
/* P
    P R
    P R O
    P R O G
    ....P R O G R A M
 */
public class StringPattern1 {
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
    }


}
