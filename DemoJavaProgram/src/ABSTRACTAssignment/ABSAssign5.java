package ABSTRACTAssignment;
abstract class MultiInherit
{
    void University(String uname, String Add)
    {
        System.out.println("University Name:" + uname);
        System.out.println("Address:" + Add);
    }

}
class Branches extends MultiInherit
{
    void Branch(String Branchname[])
    {

        System.out.println("Available Branch ");
        for(int i=0;i<Branchname.length;i++)
        {
            System.out.println("Branch Name :"+Branchname[i]);
        }
    }
}
class Students extends Branches
{
    void Student(String Strength)
    {
        System.out.println("Strength in Branch CV is "+Strength);
    }

}
public class ABSAssign5 {
    public static void main(String[] args) {

        Students o=new Students();
        o.Student("75");
        String Branchname[]={"CV","ECE","CSE"};
        o.Branch(Branchname);
        o.University("SDMCET","Kalgatagi Road,Dhaward");

    }
}
