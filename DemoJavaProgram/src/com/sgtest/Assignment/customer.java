package com.sgtest.Assignment;
class Customer1
{
    String Cname;
    String Address;
    String PhoneNum;
    String Email_Id;
}
class Project
{
    String pname;
    String pcity;
    String Req_Tech;
    int timeline;
}
class Task
{
    int tId;
    String tname;
    String Status;
    String Priority;
}
public class customer {
    public static void main(String[] args) {

        Customer1 cs1 = new Customer1();
        cs1.Cname="Chandru";
        cs1.Address="Hampinagar,Bangalore-512010";
        cs1.PhoneNum="+91 6070563780";
        cs1.Email_Id="chandu97@yahoo.com";
        System.out.println("Customer Details");
        System.out.println("Name:"+cs1.Cname);
        System.out.println("Address:"+cs1.Address);
        System.out.println("Contact Number:"+cs1.PhoneNum);
        System.out.println("Email ID"+cs1.Email_Id);
        System.out.println("-------------------------------------------");

        Project p1=new Project();
        p1.pname="Master Plan";
        p1.pcity="Udupi";
        p1.Req_Tech="ArcGIS,QGIS";
        p1.timeline= 2;
        System.out.println("Project Details");
        System.out.println("Name:"+p1.pname);
        System.out.println("City:"+p1.pcity);
        System.out.println("Required Technology:"+p1.Req_Tech);
        System.out.println("Timeline to Finish: "+p1.timeline+" Years");
        System.out.println("-------------------------------------------");

        Task T1 = new Task();
        int tId;
        String tname;
        String Status;
        String Priority;
        T1.tId=1234;
        T1.tname="Create Bank Account";
        T1.Status="Pending";
        T1.Priority="High";
        System.out.println("Task Details");
        System.out.println("Task ID:"+T1.tId);
        System.out.println("Task Name:"+T1.tname);
        System.out.println("Task Status:"+T1.Status);
        System.out.println("Priority is :"+T1.Priority);
    }
}
