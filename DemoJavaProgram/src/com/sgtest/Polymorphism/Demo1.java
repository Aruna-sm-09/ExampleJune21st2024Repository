package com.sgtest.Polymorphism;
abstract class GeometricFigure
{
    abstract void area();
}
class square extends GeometricFigure
{
    void area()
    {
        int side=7;
        System.out.println("Area of Square:"+(side*side));
    }
}
class Rectangle extends GeometricFigure
{
    @Override
    void area() {
        int l=16,b=5;
        System.out.println("Area of Rectangle:"+(l*b));
    }
}
class circle extends GeometricFigure
{
    @Override
    void area() {
        double pi=3.14;
        double r=20;
        System.out.println("Area of Cicle:"+(pi*r*r));
    }
}
public class Demo1 {
    public static void main(String[] args) {
        GeometricFigure obj=null;
        square sqr=new square();
        Rectangle rect=new Rectangle();
        circle cir=new circle();
         obj=sqr;
         obj.area();
         obj=rect;
         obj.area();
         obj=cir;
         obj.area();

    }
}
