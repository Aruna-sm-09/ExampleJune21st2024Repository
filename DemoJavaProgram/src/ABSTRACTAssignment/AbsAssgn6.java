package ABSTRACTAssignment;
class Animal
{
    void Herbivorus()
    {
        System.out.println("Cow is Herbivorus Animal");
    }
}
class Ambhibbians extends Animal
{
    void Ambhibians()
    {
        System.out.println("The Crocodile belongs to Amphibians");
    }
}
class Mammals extends Animal
{
    void an()
    {
        System.out.println("Kangaroo family are Mammals");
    }
}
class egglayingmammal extends Mammals
{
    void Egm()
    {
        System.out.println("Monotreme is an Egg Laying Mammal");
    }
}
public class AbsAssgn6 {
    public static void main(String[] args) {
        egglayingmammal o1=new egglayingmammal();
        o1.Egm();
        o1.an();
        Ambhibbians o2=new Ambhibbians();
        o2.Ambhibians();
        o2.Herbivorus();

    }
}
