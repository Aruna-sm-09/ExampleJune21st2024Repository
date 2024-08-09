package com.sgtest.Polymorphism;
abstract class MusicInstrument
{
    abstract void instrument();
}
class Guitar extends MusicInstrument
{
    @Override
    void instrument() {
        System.out.println("The Guitar is Strummed");
    }
}
class Piano extends MusicInstrument
{
    @Override
    void instrument() {
        System.out.println("The Piano is Keyed");
    }
}
class Drums extends MusicInstrument
{
    @Override
    void instrument() {
        System.out.println("The Drums are Hit");
    }
}
public class plyAssgn1 {
    public static void main(String[] args) {
        MusicInstrument MS=null;
        Guitar gt=new Guitar();
        Piano pn=new Piano();
        Drums dr=new Drums();

        MS=gt;
        MS.instrument();
        MS=pn;
        MS.instrument();
        MS=dr;
        MS.instrument();

    }
}
