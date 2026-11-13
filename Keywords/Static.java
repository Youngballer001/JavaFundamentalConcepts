//Static Keyword
/*
the static keyword means that a member belongs to the class rather than individual objects.
*/
public class Static{
    String name;
    static String university="Kabarak University";

    Static(String n) {
        name=n;
    }

    void display(){
        System.out.println(name);
        System.out.println(university);
    }

    public static void main(String[] args) {
        
        Static Object1=new Static("Denis");
        Static Object2=new Static("William");

        Object1.display();
        Object2.display();
    }
}