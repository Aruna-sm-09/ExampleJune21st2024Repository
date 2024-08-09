package com.sgtest.ReturnDemo;
class PZ
{
    char[] getPtoZvalues()
    {
        char ch[]={'P','Q','R','S','T','U','V','W','X','Y','Z'};
        return ch;
    }

}
public class practise1
{
    public static void main(String[] args)
    {
        PZ o=new PZ();
        char d[]=o.getPtoZvalues();
        for(char v:d)
        {
            System.out.println(v);
        }

    }


}
