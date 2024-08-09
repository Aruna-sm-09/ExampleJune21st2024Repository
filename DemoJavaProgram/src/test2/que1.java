package test2;
//Multiple Static Block
class Demo1
{
    static
    {
        System.out.println("First Static Block");
    }
    static
    {
        System.out.println("Second Static Block");
    }
    static
    {
        System.out.println("Third Static Block");
    }
}
public class que1 {
    public static void main(String[] args) {
        Demo1 obj=new Demo1();
    }
}
