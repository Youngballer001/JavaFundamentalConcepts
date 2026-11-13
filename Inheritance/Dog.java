//Single Inheritance
class Animal {
    
    void eat(){
        System.out.println("Animal s Eating");
    }
}

class Dog extends Animal{

    void bark(){
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {
        
        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}
