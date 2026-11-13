//Super keyword
/*
The super keyword is used to refer to the immediate parent class of a child class.
*/
class Animal{
    String name="Animal";

    void display(){
        System.out.println("Parent class method");
    }
}

class Super extends Animal{
    String name="Dog";

    void show(){
        System.out.println(super.name);

        super.display();
    }
    public static void main(String[]args){
     Super d=new Super();

     d.show();
    }
}