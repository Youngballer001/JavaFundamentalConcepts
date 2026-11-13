public class Parameterized{
    String name;
    int age;
    int ID;

    public Parameterized(String n, int a, int Id) {
        name=n;
        age=a;
        ID=Id;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("ID: "+ID);
    }

    public static void main(String[] args) {
        Parameterized Object=new Parameterized("Denis", 20, 12);

        Object.display();
    }


    
}