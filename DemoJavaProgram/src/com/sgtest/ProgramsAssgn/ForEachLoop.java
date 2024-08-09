package com.sgtest.ProgramsAssgn;
class ArrayForEach
{
    ArrayForEach(int a[][])
    {
        int count=0;
        for(int b[]:a)
        {
            for(int kk:b)
            {
                count++;
                //System.out.println(kk+" ");
            }
        }
        System.out.println("The No of elements present in 2D array are "+count);
    }
}
public class ForEachLoop {
    public static void main(String[] args) {
        ArrayForEach af=new ArrayForEach(new int[][]{{42,4,2},{5,6,7},{10,21,2}});
    }
}
