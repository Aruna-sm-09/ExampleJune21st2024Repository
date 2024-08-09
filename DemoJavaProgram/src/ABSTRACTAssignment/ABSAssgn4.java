package ABSTRACTAssignment;
//Constructor Overloading
abstract class StudentDetails
{
    StudentDetails(int ID,String StudentName)
    {
        System.out.println("Student ID : "+ID);
        System.out.println("The Student Name is "+ StudentName);
    }

    StudentDetails(String SchName,String category)
    {
        System.out.println("School Name :"+SchName);
        System.out.println("Its a "+category);
    }
}
class Education extends StudentDetails
{
    Education(String cls,int id,String stuname)
    {
        super(id,stuname);
        System.out.println("He Studing in "+cls);
    }
    Education(String schnme,String cat)
    {
        super(schnme,cat);
    }

}
public class ABSAssgn4 {
    public static void main(String[] args) {
     Education obj=new Education("10th std",101,"Harsha");
     Education obj2=new Education("Vrunda School","Higher Primary School");

    }
}
