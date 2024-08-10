package com.sgtest.Stringassignments;

public class RevString {
    public static void main(String[] args) {
        CharAT();
        TOCHARARRAY();
    }
     static void TOCHARARRAY() {
         String str1="Namaskara Karnataka";
         char ch[] = str1.toCharArray();
         System.out.println("Using toCharArray :");
         for (int i=ch.length-1;i>=0;i--)
         {

             System.out.print(ch[i]);

         }
     }
     static void CharAT()
     {
         String str="Namaste India";
         String Rev="";
         for(int i=str.length()-1;i>=0;i--)
         {
             Rev=Rev+str.charAt(i);
         }
         System.out.println("Reversed String using CharAt:"+Rev);
     }

     static void UsingSubString()
     {
         //String str="Namaste TuluNadu";
         StringBuffer str=new StringBuffer("Namaste TuluNadu");

     }
}
