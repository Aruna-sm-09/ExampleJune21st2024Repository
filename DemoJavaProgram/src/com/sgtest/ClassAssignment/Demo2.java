package com.sgtest.ClassAssignment;
class NationalPark {
    String name = "Bandipur";
    String place = "Mysore";
    String manager = "Hanumesh Jadav";
    String time = "From 8am to 6pm";

    NationalPark() {
        System.out.println("National Park Name :" + name);
        System.out.println("Situated at: " + place);
        System.out.println("Managed By :" + manager);
        System.out.println("Timings To visit :" + time);
    }
}
    class Wonderla
    {
        String wname="Hyderabad Wonderla";
        String Address="Near Ramoji film city,Manikonda road,Hyderabad-548976";
        String pno="+91 854265805";
        int games= 25;
        Wonderla()
        {
            System.out.println("Location of Wonderla :"+wname);
            System.out.println("Address :"+ Address);
            System.out.println("Contact No:"+pno);
            System.out.println("No of Avaibale water games: "+games);
        }

    }

public class Demo2 {
    public static void main(String[] args) {
        NationalPark np=new NationalPark();
        Wonderla wl=new Wonderla();
    }
}

