class Worker {
    String name;
    int salaryRate;

    Worker(String n, int s) {
        name = n;
        salaryRate = s;
    }

    int ComPay(int hours) {
        return hours * salaryRate;
    }
}

class DailyWorker extends Worker {
    DailyWorker(String n, int s) {
        super(n, s);
    }

    int ComPay(int days) {
        return days * salaryRate;
    }
}

class SalariedWorker extends Worker {
    SalariedWorker(String n, int s) {
        super(n, s);
    }

    int ComPay(int hours) {
        return 40 * salaryRate;
    }
}

public class Exp3_Program3 {
    public static void main(String[] args) {
        Worker w1 = new Worker("A", 100);
        Worker w2 = new DailyWorker("B", 100);
        Worker w3 = new SalariedWorker("C", 100);
        System.out.println("Worker A's pay: " + w1.ComPay(40));
        System.out.println("Worker B's pay: " + w2.ComPay(5));
        System.out.println("Worker C's pay: " + w3.ComPay(40));
    }
}
