class thread extends Thread {
    public thread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("This thread runs...");
    }
}

public class Constructors_of_Threads {
    public static void main(String[] args) {
        thread th = new thread("Harjot");
        th.start();
        System.out.println("The name of this thread is " + th.getName());
        System.out.println("The id of this thread is " + th.threadId()  );
    }

}
