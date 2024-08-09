package test2;
//intsance Block and Constructor
class Question2
{
    {
        System.out.println("Its Instance Block");
    }
    Question2()
    {
        System.out.println("Its Constructor");
    }
}
public class que2 {
    public static void main(String[] args) {
        Question2 obj=new Question2();
    }
}
