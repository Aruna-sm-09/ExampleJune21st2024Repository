package com.sgtest.Polymorphism;
class Animal
{
    void sound()
    {
        System.out.println("The sound of Animal");
    }
}
class Dog extends Animal
{
    @Override
    void sound() {
        super.sound();
        System.out.println("The Dog Barks");
    }
}
class Cat extends Animal
{
    @Override
    void sound() {
        super.sound();
        System.out.println("The Cat Meows");
    }
}
public class PlyAssgn3 {
    public static void main(String[] args) {
       Animal obj=null;
       Dog dog=new Dog();
       Cat cat=new Cat();

        obj=dog;
        obj.sound();
        obj=cat;
        obj.sound();


    }
}
