package com.sgtest.ReturnAssignments;
class country
{
    String getcountryname(String CN)
    {
        return CN;
    }
}
public class CountryDemo {
    public static void main(String[] args) {
        country o=new country();
        String x=o.getcountryname("India");
        System.out.println("The Country Name is "+x);
    }
}
