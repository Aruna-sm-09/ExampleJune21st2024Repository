package com.sgtest.ReturnAssignments;
class concatedemo
{
    String getconcat(String s[][])
    {
        String str="";
        for(int i=0;i<s.length;i++)
        {
            for(int j=0;j<s[i].length;j++)
            {
                str=str+s[i][j]+" ";
            }
        }
        return str;
    }
}
public class ConcateString {
    public static void main(String[] args) {
        concatedemo o=new concatedemo();
        String x[][]={{"AB","CD","EF"},{"GH","IJ","KL"},{"MN","LP","OQ"}};
        String y=o.getconcat(x);
        System.out.println(y);

    }
}
