package com.sgtest.Stringassignments;
//WAP to find No of Words in given Sentences

public class NoOfWordsInSentence {
    public static void main(String[] args) {
        int no=getNoOfWordsCount("It was a Good Movie");
        System.out.println("The Number of Words in Given Sentence :"+no);
    }
    static int getNoOfWordsCount(String Sentence)
    {
        String s[]=Sentence.split(" ");
        int count=s.length;
        return count;
    }
}
