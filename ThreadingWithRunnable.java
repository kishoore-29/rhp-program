class Worker implements Runnable {
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

public class Main {
    public static void main(String[] args) {
        Worker task1 = new Worker(1, 5);
        Worker task2 = new Worker(2, 5);

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
    }
}