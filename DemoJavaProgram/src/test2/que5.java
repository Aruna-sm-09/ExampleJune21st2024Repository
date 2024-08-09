package test2;
//one Instance method and Static method and execute in Constructor
class Question5
{
    void display()
    {
        System.out.println("Its Instance Method");
    }
    static void animal()
    {
        System.out.println("Staic Method:Rabbit");
    }
    Question5()
    {
        this.display();
       // Question5 obj=new Question5();
       // obj.display();
        Question5.animal();
        System.out.println("Its Constructor");
    }
}
public class que5 {
    public static void main(String[] args) {
        Question5 o=new Question5();
    }
}
