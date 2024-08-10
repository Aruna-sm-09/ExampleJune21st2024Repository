package com.sgtest.Stringassignments;
//WAP check given string is Palindrome or not

public class Palindrome {
    public static void main(String[] args) {
        ispalindrome();
    }
    static void ispalindrome()
    {
        String s1=new String ("Gadag");
        System.out.println("The given String :"+s1);

        String srev="";
        for(int i=s1.length()-1;i>=0;i--)
        {
            srev=srev+s1.charAt(i);
        }

        if(s1.equalsIgnoreCase(srev))
        {
            System.out.println("It's A Palindrome");
        }
        else
        {
            System.out.println("Its Not A Palindrome");
        }
        }
    }


