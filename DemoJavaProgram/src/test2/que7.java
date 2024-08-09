package test2;
//2 ins variable,2 static variable execute them in same class constructor
class Question7
{
    int age=27;
    String name="Aruna";
    static int d=20;
    static String Name="Krish";
    Question7()
    {
        System.out.println(age);
        System.out.println(name);
        System.out.println(d);
        System.out.println(Name);

    }
}
public class que7 {
    public static void main(String[] args) {
        Question7 on=new Question7();

    }
}
