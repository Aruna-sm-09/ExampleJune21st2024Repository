package com.sgtest.Inheritance;
class University
{
    void getuniversitydetails(String uname)
    {
        System.out.println("The Name of the University :"+uname);
    }
}
class Department extends University
{
    void getdept(int no)
    {
        System.out.println("The Available Deptartments are :"+no);
        System.out.println("As Follows : Civil Engineering,Electrical Engineering and Mechanical Engineering");
    }
}
class Lab extends Department
{
    void getlab(String expt)
    {
        System.out.println("The Experiment counducted in dept: "+expt);
    }
}
public class Multilevel11 {
    public static void main(String[] args) {
        Lab o = new Lab();
        o.getlab("Le-Chatelier Test");
        o.getdept(03);
        o.getuniversitydetails("SDMCET,Dharwad");

    }
}
