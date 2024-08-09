package com.sgtest.ReturnAssignments;
class College
{
    String getCollegeName(String CN)
    {
        return CN;
    }
}
public class collegedemo {
    public static void main(String[] args) {
        College o=new College();
        String s=o.getCollegeName("GnanaJyothi");
        System.out.println("College Name is "+s);
    }
}
