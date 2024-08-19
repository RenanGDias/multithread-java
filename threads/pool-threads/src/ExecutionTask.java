import java.util.concurrent.Executors;
import java.util.concurrent.*;

public class ExecutionTask {
    public static void main(String[] args) {
        int nt = 5;
        ExecutorService exec = Executors.newFixedThreadPool(nt);
        int r = 0;
        while (true) {
            exec.execute(new RunnableTask(++r));
        }
    }
}
