package Exp_8;

    public class Exp8_Program1 extends Thread {
        public void run() {
            System.out.println("Thread is running");
        }
    }
    
    class ThreadDemo implements Runnable {
        public void run() {
            System.out.println("Thread is running");
        }
    }
    
    class Main {
        public static void main(String[] args) {
            Exp8_Program1 t1 = new Exp8_Program1();
            t1.start();
    
            ThreadDemo t2 = new ThreadDemo();
            Thread t3 = new Thread(t2);
            t3.start();
        }
}
