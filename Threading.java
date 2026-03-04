import java.util.*;
class Worker extends Thread {
    private int id;
    private int n;

    public Worker(int id, int n) {
        this.id = id;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.println("Worker " + id + " : " + i);
        }
    }
}

public class Threading {
    public static void main(String[] args) {
        Worker w1 = new Worker(1, 5);
        Worker w2 = new Worker(2, 5);

        w1.start();
        w2.start();
    }
}