package gerenciamento_threads;

public class MyRun implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + ": " + t.threadId());
    }
}
