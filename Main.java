class Counter {
    int count =0;

    public void increment() {
        count++;
        System.out.println(Thread.currentThread().getName()+count);
    }

    synchronized public void decrement() {
        count--;
        System.out.println(Thread.currentThread().getName()+count);
    }
}

public class Main {
    public static Counter counter = new Counter();

    public static void main(String[] args) {
        Runnable task1 = () -> {
            for (int i = 0; i < 10; i++) {
                counter.decrement();
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 10; i++) {
                counter.decrement();
            }
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
    }
}
