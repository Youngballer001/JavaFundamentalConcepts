//This keyword
public class This{
    String name;
    int age;

    public This(String name, int age) {
        this.name=name;
        this.age=age;
    }

    void display(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public static void main(String[] args) {
        This Object=new This("Denis", 20);

        Object.display();
    }
}