package com.sgtest.ReturnAssignments;
class Colour
{
    String[] getcolors()
    {
        String[] c={"Black","Green","White"};
        return c;
    }
}
public class ColourDemo {
    public static void main(String[] args) {
        Colour o=new Colour();
        String[]x=o.getcolors();
        System.out.println("The Three Favourite colours are ");
        for(String read : x)
        {
            System.out.println(read);
        }

    }
}
