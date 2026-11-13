//Association
//This describe relationships between classes.

class Teacher{

    void teach(){
        System.out.println("Teacher teaches students.");
    }
}
public class Student{

    void learn(){
        System.out.println("Student learns.");
    }

    public static void main(String[] args) {
        
        Teacher t = new Teacher();
        Student s = new Student();

        t.teach();
        s.learn();
    }
}
