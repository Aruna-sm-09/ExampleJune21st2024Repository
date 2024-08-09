package com.sgtest.Constructor;
//when both Instance variable name and parameter name are same then "this" operator is used
class  Customer
{
    //Instance Variables without initialisation
    String firstname;
    String email;

    //constructor(parameters) with in class
    Customer(String firstname,String email)
    {
        System.out.println("In Constructor!!");
        this.firstname=firstname;
        this.email=email;
        System.out.println("First Name1:"+firstname);
        System.out.println("Email ID :"+email);

    }
    //void method is used only for displaying output
    void display()
    {
        System.out.println("In Method!!");
        System.out.println("First Name2:"+ firstname);
        System.out.println("Email ID:"+email);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Customer o1=new Customer("manu","m@gmail.com");

        o1.display();
    }
}
