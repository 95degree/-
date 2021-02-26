import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoll {
    static int n1 =0;
    public static void main(String[] args) {

        Runnable task = () -> {
            n1++;
            System.out.println(Thread.currentThread().getName());
            System.out.println(n1);
        };

        ExecutorService exr3 = Executors.newSingleThreadExecutor();
        ExecutorService exr2 = Executors.newFixedThreadPool(5);
        ExecutorService exr1 = Executors.newCachedThreadPool();



        for (int i = 0; i < 10; i++) {
            exr1.submit(task);
            exr2.submit(task);
            exr3.submit(task);
        }

        System.out.println("End" + Thread.currentThread().getName());
        exr1.shutdown();
        exr2.shutdown();
        exr3.shutdown();
    }
}
