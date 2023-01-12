
// creating the first class by implementing runnable interface
class MyRunnableInterface1 implements Runnable {
    public void run() {
        while (true) {
            System.out.println("This is Thread 11111");
        }
    }
}

// creating the second class by implementing runnable interface

class MyRunnableInterface2 implements Runnable {
    public void run() {
        while (true) {
            System.out.println("This is Thread 22222");
        }
    }
}



public class Runnable_interface {
    public static void main(String[] args) {
        MyRunnableInterface1 bullet1 = new MyRunnableInterface1();
        MyRunnableInterface2 bullet2 = new MyRunnableInterface2();

        Thread gun1 = new Thread(bullet1); 
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
