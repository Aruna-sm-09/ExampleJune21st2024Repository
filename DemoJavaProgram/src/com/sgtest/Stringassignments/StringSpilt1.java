package com.sgtest.Stringassignments;
//Given String SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY insert comma without using split and replace

public class StringSpilt1 {
    public static void main(String[] args) {
        GivenStringSplit();
    }
    static void GivenStringSplit()
    {
        String str=new String("SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY");
        String delimiter=new String("DAY");

        for(int i=0;i<str.length();i++)
        {
            str.replaceAll("DAY"," ");
        }

        System.out.println(str);
    }
}
