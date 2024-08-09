package com.sgtest.overloading;
class Buyer
    {
        Buyer(int id,int points)
        {
            System.out.println("Buyer ID :" + id);
            System.out.println("Points Earned:" + points);
        }

        Buyer(String bname,String address,String phno,String email) {
            System.out.println("Buyer Name :" + bname);
            System.out.println("Address :" + address);
            System.out.println("Contact No :" + phno);
            System.out.println("Email ID :" + email);
        }
}

public class Buyers {
    public static void main(String[] args) {
        Buyer b1 = new Buyer(21, 100);
        Buyer b2 = new Buyer("Kishor", "Mysore", "+91 802653941", "krish@gm.com");
    }
}
