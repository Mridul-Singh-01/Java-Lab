package Exp_8;

class Test implements Runnable {
    int n=1;

    @Override
    public void run() {
        System.out.println(n++);
    }


}
public class Exp8_Program3
{

    static Thread[] threads = new Thread[10];
    public static void main(String[] args)
    {
        Test c = new Test();
        for(int i=0;i<10;i++)
        {
            threads[i] = new Thread(c);
            threads[i].start();
        }

    }
}