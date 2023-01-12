interface Writer{
    abstract void write();
}

class ABC{
    void anything(){
        System.out.println("This function does anything...");
    }
}

class Pencil extends ABC implements Writer{
    public void write(){
        System.out.println("We write using pencil");
    }
}

class Pen implements Writer{
    public void write(){
        System.out.println("We write using a pen");
    }
}

class Kit{
    void doSomething(Writer p){
        p.write();
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Kit k = new Kit();
        Writer p = new Pen();
        Writer pc = new Pencil();

        k.doSomething(pc);
    }
}
