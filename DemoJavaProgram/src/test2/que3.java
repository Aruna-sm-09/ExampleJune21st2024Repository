package test2;
//multiple instance Block
class Question3
{
    {
        System.out.println("First INstance Block");
    }
    {
        System.out.println("Second Instance Block");
    }
    {
        System.out.println("Third Instance Block");
    }
}
public class que3 {
    public static void main(String[] args) {
        Question3 ob=new Question3();
    }
}
