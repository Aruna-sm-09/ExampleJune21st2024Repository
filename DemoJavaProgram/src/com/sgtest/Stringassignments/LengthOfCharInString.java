package com.sgtest.Stringassignments;
//WAP to Display Number of Characters in a given String
public class LengthOfCharInString
{
    public static void main(String[] args)
    {
        getNoOfChar("Aruna");
        namecount();
    }

    static int getNoOfChar(String Anyname)
    {
        int count = Anyname.length();
        System.out.println("No of Characters in given String :" + count);
        return count;
    }
    //without using length method
    static void namecount()
    {
        int count=0;
        String sy="Kiran Narsapuram";
        for(char hh:sy.toCharArray())
        {
            count++;
        }
        System.out.println("No of Characters in given String :"+count);
    }
}
