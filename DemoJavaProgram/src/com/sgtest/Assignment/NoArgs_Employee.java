package com.sgtest.Assignment;

class EmpDetails1
{
    String ename;
    int age;
    String Email_Id;
    String Address;
  EmpDetails1() {
      ename = "Harini";
      age = 25;
      Email_Id = "harini123@gmail.com";
      Address = "Vijanagar,4th Block,Bangalore-54128";
      System.out.println("Employee Name:" + ename);
      System.out.println("Age:" + age);
      System.out.println("Email_ID:" + Email_Id);
      System.out.println("Address:" + Address);
      System.out.println("-----------------------------------------");
  }
}
class Department1
{
    int id;
    String deptname;
    int salary;
    String Manager;
  Department1() {
      id = 10;
      deptname = "Senior Engineer";
      salary = 25000;
      Manager = "Krishna";
      System.out.println("Department Id:" + id);
      System.out.println("Department Name:" + deptname);
      System.out.println("Salary of Employee:" + salary);
      System.out.println("Reporting Manager:" + Manager);
      System.out.println("-----------------------------------------");
  }

}
class Insurance1
{
    String type;
    String Eligibility;
    int amount;
    int validity;
    Insurance1() {
        type = "Health Insurance";
        Eligibility = "Having Salary above 25,000";
        amount = 100000;
        validity = 2;
        System.out.println("Insurance Type:" + type);
        System.out.println("Eligible Employees:" + Eligibility);
        System.out.println("Insurance Amount:" + amount);
        System.out.println("Insurance is valid till:" + validity + " Years");
    }
}

public class NoArgs_Employee
{
    public static void main(String[] args) {
        EmpDetails1 obj1=new EmpDetails1();
        Department1 dept1=new Department1();
        Insurance1 ins1=new Insurance1();

    }
}
