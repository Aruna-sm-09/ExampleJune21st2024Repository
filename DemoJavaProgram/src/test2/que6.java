package test2;
//2 classes,one class has instance method and other has constructor execute instance  method in constructor
class question61
{
    void display()
    {
        System.out.println("Its Instance Method");
    }
}
class question62
{
    question62()
    {
        System.out.println("Ist Constructor");
        question61 obj=new question61();
        obj.display();
    }
}
public class que6 {
    public static void main(String[] args) {
        question62 o2=new question62();
    }
}
