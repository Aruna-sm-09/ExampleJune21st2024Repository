package com.sgtest.Encapsulation;
class Encapd
{
    private int StudentId;
    private String Studname;

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudname() {
        return Studname;
    }

    public void setStudname(String studname) {
        Studname = studname;
    }
}
public class encapDemo {
    public static void main(String[] args) {
        Encapd o=new Encapd();
        o.setStudentId(15);
        o.setStudname("Preeti");
        System.out.println("Sudent Id :"+o.getStudentId());
        System.out.println("Student Name :"+o.getStudname());

    }
}
