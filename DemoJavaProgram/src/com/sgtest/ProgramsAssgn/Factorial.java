package com.sgtest.ProgramsAssgn;
class fact
{
    void factnum(int num)
    {
        int fact=1;
        for(int i=2;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of num :"+fact);
    }
}

public class Factorial {
    public static void main(String[] args) {
        fact fn=new fact();
        fn.factnum(8);
        fn.factnum(9);
        fn.factnum(5);
    }
}
