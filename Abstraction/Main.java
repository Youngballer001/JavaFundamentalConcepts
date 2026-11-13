//Abstraction.
//Abstract Classes.
/*
Abstraction means hiding implementation details and showing only essential functionality.
*/

abstract class Animal{

    abstract void sound();

    void sleep(){
        System.out.println("Animal is Sleeping.");
    }
}

class Dog extends Animal{

    @Override 
    void sound(){
        System.out.println("Dog bark.");
    }
}

public class Main{

    public static void main(String[] args) {
        
        Dog d = new Dog();

        d.sound();
        d.sleep();
    }
}
