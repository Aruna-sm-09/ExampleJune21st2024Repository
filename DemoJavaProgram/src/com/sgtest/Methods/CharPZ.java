package com.sgtest.Methods;
class CharArray
{
    void Chr()
    {
        for(char c='P';c<='Z';c++)
        {
            System.out.println(c);
        }
    }
}
public class CharPZ {
    public static void main(String[] args) {
        CharArray lc=new CharArray();
        lc.Chr();

    }
}
