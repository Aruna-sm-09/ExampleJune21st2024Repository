package com.sgtest.Polymorphism;
class Channel
{
    void Broadcast()
    {
       // System.out.println("Broadcasting on Channel");
    }
}
class TV extends Channel
{
    @Override
    void Broadcast() {
        super.Broadcast();
        System.out.println("Broadcasting on TV(Audio+Video)");
    }
}
class Radio extends Channel
{
    @Override
    void Broadcast() {
        super.Broadcast();
        System.out.println("Broadcasting on Radio(Only Audio)");
    }
}
class SocialMedial extends Channel
{
    @Override
    void Broadcast() {
        super.Broadcast();
        System.out.println("Broadcasting On Social Media");
    }
}
public class polyAssgn5 {
    public static void main(String[] args) {
        Channel ch=null;

        SocialMedial socialmedia=new SocialMedial();
        TV tv=new TV();
        Radio rd=new Radio();

        ch=socialmedia;
        ch.Broadcast();
        ch=tv;
        ch.Broadcast();
        ch=rd;
        ch.Broadcast();

    }
}
