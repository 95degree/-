import java.util.concurrent.*;

public class CallableFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> task = () ->{
            int sum =0;
            for(int i =0; i<10; i++)
                sum+=i;
            return sum;
        };

        ExecutorService exr = Executors.newSingleThreadExecutor();
        Future<Integer> fur = exr.submit(task);

        Integer r = fur.get();
        System.out.println(r);
        exr.shutdown();
    }
}
