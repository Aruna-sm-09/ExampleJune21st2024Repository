package ABSTRACTAssignment;
abstract class entity
{
    entity(int id,double price)
    {
        System.out.println("Entity ID : "+id);
        System.out.println("Price of the entity : "+price);
    }
}
class Product extends entity
{
    Product(int id,String pName,String Pbrand,double price)
    {
        super(id,price);
        System.out.println("Name of the Product : " + pName);
        System.out.println("Brand of the Product : " + Pbrand);
    }
}
class Customer extends Product
{
    Customer(int id,String pName,String Pbrand,String CName,String Add,double price)
    {
        super(id,pName,Pbrand,price);
        System.out.println("Customer Name : "+CName);
        System.out.println("Address : "+Add);
    }
}


public class AbsAssgn7 {
    public static void main(String[] args) {
        Customer o=new Customer(42,"Air Cooler","Bajaj","Joseph","Indira Nagar,Near SNow World Bangalore",12450.00);
    }
}
