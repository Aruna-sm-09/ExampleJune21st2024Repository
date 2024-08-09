package com.sgtest.ProgramsAssgn;
class CharConcat
{
    CharConcat(char c[][])
    {
        String st=" ";
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[i].length;j++)
            {
                if(j==2)
                {
                    st= (st+c[i][j]);
                }
            }
        }
        System.out.println("Concatinated 3rd column elements from char Array :"+st);
    }
}
public class CharArray {
    public static void main(String[] args) {
        CharConcat cc=new CharConcat(new char[][] {{'A','W','E'},{'S','U','M'},{'P','O','T'}});
    }
}
