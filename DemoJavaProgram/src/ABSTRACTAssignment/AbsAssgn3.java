package ABSTRACTAssignment;
abstract class BlockStaticAlone
{
    static
    {
        int a=10,b=20;
        int res=a*b;
        System.out.println("Multiplication Result:"+res);
    }
}
class Division extends BlockStaticAlone
{
    static
    {
        int x=80,y=60;
        int result=x/y;
        System.out.println("Division Result:"+result);
    }
}
public class AbsAssgn3 {
    public static void main(String[] args) {
        Division o=new Division();
    }
}
