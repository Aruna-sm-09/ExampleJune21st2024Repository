package com.sgtest.Parameter;
class University
{
    String uname;
    String url;
    String address;
    String phno;
    University(String un,String url,String add,String phno)
    {
        this.uname=un;
        this.url=url;
        this.address=add;
        this.phno=phno;
         System.out.println("University Name:"+un);
         System.out.println("Website:"+url);
         System.out.println("Address :"+add);
         System.out.println("Contact No:"+phno);
         System.out.println("-------------------------------------------------");
    }
}

class College
{
    String cname;
    String courses;
    String address;
    String phno;
    College(String cn,String cr,String add,String pn)
    {
        this.cname=cn;
        this.courses=cr;
        this.address=add;
        this.phno=pn;
        System.out.println("College Name:"+cn);
        System.out.println("Courses availabe:"+cr);
        System.out.println("Address :"+add);
        System.out.println("Contact No:"+pn);
         System.out.println("-------------------------------------------------");
    }
}

class Student
{
    int rno;
    String sname;
    String schname;
    int cls;
    Student(int rno,String sn,String shn,int cls)
    {
        this.rno=rno;
        this.sname=sn;
        this.schname=shn;
        this.cls=cls;
        System.out.println("Roll No:"+rno);
        System.out.println("Student Name:"+sn);
        System.out.println("School Name :"+shn);
        System.out.println("Class:"+cls+"th Standard");
         System.out.println("-------------------------------------------------");
    }
}
public class Assignment1 {
    public static void main(String[] args) {
        University obj1=new University("Manasagangotri","uni.mysr.in","UOM,Near Kukkeralli kere,Hunsur road,Mysroe-541285","8023 52041");
        College cj1=new College("GnanaJyothi","Science,Commerce,Arts","Mehaboobnagar,near market,Gangavati Road,Sindhanur-584128","8120 64205");
        Student s1=new Student(32,"Ramesh","Montessori Public School",10);
    }
}
