//Aggregation.
/*
one class contains a reference to another independently existing class.
 */

class Department{

    String name;

    Department(String name) {
    this.name=name;
    }
}

public class University{

    Department department;

    University(Department department){
        this.department=department;
    }

    public static void main(String[] args) {
        
        Department d = new Department("Computer Science");

        University u = new University(d);

        System.out.println(u.department.name);
    }
}