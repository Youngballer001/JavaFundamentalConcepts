//interfaces.
/*
an interface defines a contract that implementing classes must fulfil.
*/

interface vehicle{

    void start();

    void stop();
}

class car implements  vehicle{

    public void start(){
        System.out.println("Cars has started.");
    }

   public void stop(){
    System.out.println("Car has stopped.");
   } 
}

 public  class Abstraction{

    public static void main(String[] args) {
        
        car c1=new car();

        c1.start();
        c1.stop();
    }
}