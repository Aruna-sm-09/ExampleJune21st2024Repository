package com.sgtest.ProgramsAssgn;
class StringConcate
{
    StringConcate(String s[][])
    {
        String combine=" ";
        for(int i=0;i<s.length;i++)
        {
            if(i==1)
            {
                for (int j = 0; j < s[i].length; j++)
                {
                    combine=combine+s[i][j];

                }
                System.out.print("The concatinated 2nd row elements result :"+combine);
            }
        }
    }
}
public class StringArray {
    public static void main(String[] args) {
        StringConcate cr=new StringConcate(new String[][] {{"Amul","Cornetto","Scoops"},{"Britania","Good_day","50-50"},{"Tata","Birla","ACC"}});
    }
}
