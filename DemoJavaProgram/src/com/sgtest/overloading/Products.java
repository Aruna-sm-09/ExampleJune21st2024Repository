package com.sgtest.overloading;
class Product
{
    Product(String pname,String type )
    {
        System.out.println("Product Name:"+pname);
        System.out.println("Type of Product:"+type);
    }
    Product(int pid,int price)
    {
        System.out.println("Product ID:"+pid);
        System.out.println("Price:"+price);
    }
    Product(double rating)
    {
        System.out.println("Rating for Product Brand:"+rating);
    }
}

public class Products {
    public static void main(String[] args) {
        Product p1 = new Product("Paavay", "Saree");
        Product p2 = new Product(16, 4200);
        Product p3 = new Product(4.8);
    }
}
