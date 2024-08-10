package com.sgtest.Stringassignments;
//WAP Given String Bangalore And Mysore display Mysore And Bangalore

public class RevWords {
    public static void main(String[] args) {
        revsent();
    }

    static void revsent()
    {
        String sf="Bangalore And Mysore";
        String f[]=sf.split(" ");
            for(int i=f.length-1;i>=0;i--)
            {

                System.out.print(f[i]+" ");
            }
        }
}
