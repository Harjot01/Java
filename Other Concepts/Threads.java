import java.lang.Thread;

// creating a class for first thread
class A extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("1st is running");
        }
    }
}

// creating a class for second thread
class B extends Thread{
    @Override 
    public void run(){
        while(true){
            System.out.println("2nd is running");
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        A a = new A(); //creating thread 1
        B b = new B(); //creating thread 2
        a.start();
        b.start();
    }
}

