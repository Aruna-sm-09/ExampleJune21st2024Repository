package com.sgtest.Assignment;
class User
{
    int userid;
    String name;
    String emailid;
    String phonenumer;
    String usertype;
}
class UserProfile
{
    String name;
    String location;
    String skills;
    String experience;
}
class Role
{
    int rid;
    String rname;
    String ename;
    String permission;
}
public class Assignment5 {
    public static void main(String[] args) {
        User u1=new User();
        u1.userid=12;
        u1.name="Prabhas";
        u1.emailid="prabhu76@yahoo.com";
        u1.phonenumer="+91 7056895434";
        u1.usertype="Admin";
        System.out.println("*** Details of User ***");
        System.out.println("User ID :"+u1.userid);
        System.out.println("Username :"+u1.name);
        System.out.println("Email ID :"+u1.emailid);
        System.out.println("Contact No :"+u1.phonenumer);
        System.out.println("-----------------------------------------------------");

        UserProfile up=new UserProfile();
        up.name="Suman";
        up.location="Mangalore";
        up.skills="Java Programmer";
        up.experience="4+ years";
        System.out.println("*** User Profile ***");
        System.out.println("Username :"+up.name);
        System.out.println("Location :"+up.location);
        System.out.println("Email ID :"+up.skills);
        System.out.println("Contact No :"+up.experience);
        System.out.println("-----------------------------------------------------");

        Role R1=new Role();
        R1.rid=15;
        R1.rname="Supervisor";
        R1.ename="Maruthi";
        R1.permission="Manage content";
        System.out.println("*** Role ***");
        System.out.println("Role ID :"+R1.rid);
        System.out.println("Role Name:"+R1.rname);
        System.out.println("Employee Name :"+R1.ename);
        System.out.println("Given Access to :"+R1.permission);
        System.out.println("-----------------------------------------------------");
    }
}
