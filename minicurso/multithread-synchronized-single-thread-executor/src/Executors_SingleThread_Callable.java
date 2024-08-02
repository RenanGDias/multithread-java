import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class Executors_SingleThread_Callable {

    public static void main(String[] args) throws Exception {
        ExecutorService executor = null;
        try {
            executor = Executors.newSingleThreadExecutor();

            Future<String> future = executor.submit(new Tarefa());

            System.out.println(future.isDone());
            // System.out.println(future.get());
            System.out.println(future.get(1, TimeUnit.SECONDS));
            System.out.println(future.isDone());
            // executor.shutdown();
            // executor.awaitTermination(10, TimeUnit.SECONDS);
            // System.out.println(future.isDone());
        } catch (Exception e) {
            throw e;
        } finally {
            if (executor != null) {
                executor.shutdownNow();
                // executor.shutdownNow();
            }

        }
    }

    public static class Tarefa implements Callable<String> {
        @Override
        public String call() throws Exception {
            Thread.sleep(1000);
            String name = Thread.currentThread().getName();
            int nextInt = new Random().nextInt(1000);
            return name + ": Inscreva-se no canal! " + nextInt;
        }
    }
}
