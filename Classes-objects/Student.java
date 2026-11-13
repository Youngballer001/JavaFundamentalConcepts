/*
Example of Classes And Objects in OOP With Java.
A class is a blueprint/prototype for creating an object.
An Object is an instance of a class/ or an entity in the real world that has attributes and behaviours
Student is our class in this example while student1 is the object
*/

public class Student {
    String name;
    int age;
    int RegNo;
    String Course;
    int yearofstudy;

    void study(){
        System.out.print("\n");
        System.out.println("Our Students are studying hard at campus!");
        System.out.println("We store our students details safely;");
        System.out.print("\n");
    }

    void displayStudents(){
        System.out.println("Student Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Registration Number: "+RegNo);
        System.out.println("Course: "+Course);
        System.out.println("Year of Study: "+yearofstudy);
        System.out.print("\n");
    }

    public static void main(String[] args) {
        
        Student Student1=new Student();

        Student1.name="Denis";
        Student1.age=20;
        Student1.RegNo=32456;
        Student1.Course="Computer Science";
        Student1.yearofstudy=3;
        
        Student1.study();
        Student1.displayStudents();
    }


    
}
