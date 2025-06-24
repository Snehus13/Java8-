package Streamapi;


interface Animal{

    public void speak();
}

class Dog implements Animal{
    public void speak()
    {
        System.out.println("woof");
    }
}

class Cat implements Animal{
    public void speak()
    {
        System.out.println("meoq");
    }
}



public class Abstraction {
    public static void main(String [] args)
    {

    
    Dog d = new Dog ();
    Cat c = new Cat();

    d.speak();
    c.speak();
}
}
