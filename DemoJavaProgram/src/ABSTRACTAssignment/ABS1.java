package ABSTRACTAssignment;
abstract class onlyStaticMethod
{
    static void Addition(int x,int y)
    {
        int res=x+y;
        System.out.println("Addition of two numbers :"+res);
    }
}

public class ABS1 {
    public static void main(String[] args) {
        onlyStaticMethod.Addition(10,20 );

    }
}
