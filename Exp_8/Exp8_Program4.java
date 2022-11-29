package Exp_8;

public class Exp8_Program4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadDemo());
        Thread t2 = new Thread(new ThreadDemo());
        Thread t3 = new Thread(new ThreadDemo());
        Thread t4 = new Thread(new ThreadDemo());
        Thread t5 = new Thread(new ThreadDemo());
        t1.setPriority(1);
        t2.setPriority(2);
        t3.setPriority(3);
        t4.setPriority(4);
        t5.setPriority(5);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        try {
            Thread.sleep(1000);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("t1 is alive: " + t1.isAlive());
        System.out.println("t2 is alive: " + t2.isAlive());
        System.out.println("t3 is alive: " + t3.isAlive());
        System.out.println("t4 is alive: " + t4.isAlive());
        System.out.println("t5 is alive: " + t5.isAlive());
    }
}

class ThreadDemo implements Runnable {
    int n = 1;

    @Override
    public void run() {
        System.out.println(n++);
    }
}