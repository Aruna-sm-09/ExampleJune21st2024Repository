package com.sgtest.Assignment;
class User1
{
    int userid;
    String name;
    String emailid;
    String phonenumer;
    String usertype;
    User1()
    {
        userid = 12;
        name = "Prabhas";
        emailid = "prabhu76@yahoo.com";
        phonenumer = "+91 7056895434";
        usertype = "Admin";
        System.out.println("*** Details of User ***");
        System.out.println("User ID :" + userid);
        System.out.println("Username :" + name);
        System.out.println("Email ID :" + emailid);
        System.out.println("Contact No :" + phonenumer);
        System.out.println("-----------------------------------------------------");
    }
}

class UserProfile1
{
    String name;
    String location;
    String skills;
    String experience;
    UserProfile1() {
        name = "Suman";
        location = "Mangalore";
        skills = "Java Programmer";
        experience = "4+ years";
        System.out.println("*** User Profile ***");
        System.out.println("Username :" + name);
        System.out.println("Location :" + location);
        System.out.println("Email ID :" + skills);
        System.out.println("Contact No :" + experience);
        System.out.println("-----------------------------------------------------");
    }
}
class Role1
{
    int rid;
    String rname;
    String ename;
    String permission;
    Role1() {
        rid = 15;
        rname = "Supervisor";
        ename = "Maruthi";
        permission = "Manage content";
        System.out.println("*** Role ***");
        System.out.println("Role ID :" + rid);
        System.out.println("Role Name:" + rname);
        System.out.println("Employee Name :" + ename);
        System.out.println("Given Access to :" + permission);
        System.out.println("-----------------------------------------------------");
    }
}
public class NoArgs5 {
    public static void main(String[] args) {
        User1 u1=new User1();
        UserProfile1 up=new UserProfile1();
        Role1 R1=new Role1();
    }
}


