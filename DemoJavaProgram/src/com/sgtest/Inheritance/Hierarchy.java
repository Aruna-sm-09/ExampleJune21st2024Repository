package com.sgtest.Inheritance;
class Employee
{
    void work(String empname)
    {
        System.out.println("The Employee Name :"+empname);
    }
}
class Manager extends Employee
{
    void manager(String name)
    {
        System.out.println("The Manager Name is "+name);
    }

}
class Director extends Employee
{
    void Director(String mname)
    {
        System.out.println("The Director name is "+mname);
    }
}
public class Hierarchy {
    public static void main(String[] args) {
            Director as=new Director();
            as.Director("pavan");
            as.work("naveen");
            Manager as1=new Manager();
            as1.manager("arunaprasad");
            as1.work("dhanu");
        }
}
