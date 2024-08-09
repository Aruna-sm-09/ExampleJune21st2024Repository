package test2;
//class has one Instance Method and one Static Method execute in static block
class Question4
{
    void display()
    {
        System.out.println("Its Instance Method");
    }
    static void Bird()
    {
        System.out.println("Peacock is National bird");
    }
    static
    {

        Question4 ob=new Question4();
        ob.display();
        Question4.Bird();
        System.out.println("Its Static Block");

    }
}
public class que4 {
    public static void main(String[] args) {
        Question4 oj=new Question4();
    }
}
