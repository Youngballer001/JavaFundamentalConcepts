//Compostion.
/*
one object owns another object as part of its lifecycle.
*/

class Engine{

    void start(){
        System.out.println("Engine started.");
    }
}

public class Car{

    private Engine engine;

     Car() {
        engine = new Engine();
    }

    void startCar(){
        engine.start();
        System.out.println("Car Started");
    }

    public static void main(String[] args) {
        Car car = new Car();

        car.startCar();
    }

    
}