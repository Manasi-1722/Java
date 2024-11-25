package Multithreading;


class Run1 implements Runnable{
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Thread 1");
        }
    }
}

class Run2 implements Runnable {
    public void run() {
        for (int i = 0; i < 25; i++) {
            System.out.println("Thread 2");
        }
    }
}
public class Runnable_Interface {
    public static void main(String[] args) {
        Run1 bullet1 = new Run1();
        Thread gun1 = new Thread(bullet1);
        gun1.start();

        Run2 bullet2 = new Run2();
        Thread gun2 = new Thread(bullet2);
        gun2.start();



    }
}
