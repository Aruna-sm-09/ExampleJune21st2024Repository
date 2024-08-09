package com.sgtest.Assignment;
    class EmpDetails
    {
        String ename;
        int age;
        String Email_Id;
        String Address;
    }
    class Department
    {
        int id;
        String deptname;
        int salary;
        String Manager;

    }
    class Insurance
    {
        String type;
        String Eligibility;
        int amount;
        int validity;
    }

public class Employee {
    public static void main(String[] args) {
        EmpDetails obj1=new EmpDetails();
        obj1.ename="Harini";
        obj1.age=25;
        obj1.Email_Id="harini123@gmail.com";
        obj1.Address="Vijanagar,4th Block,Bangalore-54128";
        System.out.println("Employee Name:"+obj1.ename);
        System.out.println("Age:"+obj1.age);
        System.out.println("Email_ID:"+obj1.Email_Id);
        System.out.println("Address:"+obj1.Address);
        System.out.println("-----------------------------------------");

        Department dept1=new Department();
        dept1.id=10;
        dept1.deptname="Senior Engineer";
        dept1.salary=25000;
        dept1.Manager="Krishna";
        System.out.println("Department Id:"+dept1.id);
        System.out.println("Department Name:"+dept1.deptname);
        System.out.println("Salary of Employee:"+dept1.salary);
        System.out.println("Reporting Manager:"+dept1.Manager);
        System.out.println("-----------------------------------------");

        Insurance ins1=new Insurance();
        ins1.type="Health Insurance";
        ins1.Eligibility="Having Salary above 25,000";
        ins1.amount= 100000;
        ins1.validity= 2;
        System.out.println("Insurance Type:"+ins1.type);
        System.out.println("Eligible Employees:"+ins1.Eligibility);
        System.out.println("Insurance Amount:"+ins1.amount);
        System.out.println("Insurance is valid till:"+ins1.validity+" Years");


    }
}
