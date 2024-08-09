package com.sgtest.ProgramsAssgn;
class StringConcat
{
    StringConcat(String s[][])
    {
        String str=" ";
        for(int i=0;i<s.length;i++)
        {
            for(int j=0;j<s[i].length;j++)
            {
                if((j==0) || (j==1))
                {
                    str=str+s[i][j];
                }
            }
        }
        System.out.print(str);
    }
}
public class ConcateString1_2 {
    public static void main(String[] args) {
        StringConcat sc=new StringConcat(new String[][]{{"Amul","Cornetto","Scoops"},{"Britania","Good_day","50-50"},{"Tata","Birla","ACC"}});
    }
}
