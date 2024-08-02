import java.time.LocalTime;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Executors_Scheduled {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);

        // executor.schedule(new Tarefa(), 2, TimeUnit.SECONDS);
        // executor.scheduleAtFixedRate(new Tarefa(), 0, 1, TimeUnit.SECONDS);
        executor.scheduleWithFixedDelay(new Tarefa(), 0, 1, TimeUnit.SECONDS);

        // executor.shutdown();
    }

    public static class Tarefa implements Runnable {
        
        public void run() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(LocalTime.now());
            String name = Thread.currentThread().getName();
            int nextInt = new Random().nextInt(1000);
            System.out.println(name + ": Inscreva-se no canal! " + nextInt);
        }
    }
}
