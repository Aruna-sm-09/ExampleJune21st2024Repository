package com.sgtest.ReturnAssignments;
class Friends
{
    String[] getFriendsname()
    {
        String[] f={"Raziya","Nikitha","Sachu"};
        return f;
    }
}
public class Friendsdemo {
    public static void main(String[] args) {
        Friends o=new Friends();
        String [] v=o.getFriendsname();
        System.out.println("Three Names are ");
        for(String names:v)
        {
            System.out.println(names);
        }
    }
}
