package Multithreading;


class My1 extends Thread {
    public My1(String name) {
        super(name);
    }
    public void run() {
        System.out.println("Thread1");
    }
}

class My2 extends Thread {
    public My2(String name) {
        super(name);
    }
    public void run() {
        System.out.println("Thread2");
    }
}
public class Thread_constructor {
    public static void main(String[] args) {
        My1 t1 = new My1("Mansi");
        My2 t2 = new My2("Nandini");
        t1.start();
        t2.start();
        

        System.out.println(t1.getId() + " " + t1.getName());
        System.out.println(t2.getId() + " " + t2.getName());

        

    }
}
