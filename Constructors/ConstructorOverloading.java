public class ConstructorOverloading{
    String name;
    int age;


    public ConstructorOverloading(){
        name="Unkown";
        age=0;
    }

    public ConstructorOverloading(String n) {
        name = n;
        age=20;
    }

    public ConstructorOverloading(String n, int a){
        name=n;
        age=a;

    }

    void display(){
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        
        ConstructorOverloading Object1=new ConstructorOverloading();
        ConstructorOverloading Object2=new ConstructorOverloading("Denis");
        ConstructorOverloading Object3=new ConstructorOverloading("Willliam", 22);
    

    Object1.display();
    Object2.display();
    Object3.display();
    }
    
}