import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class ClassesAtomicas {

    // static AtomicInteger i = new AtomicInteger(-1);
    // static AtomicBoolean b =  new AtomicBoolean(false);
    static AtomicReference<Object> r =  new AtomicReference<>(new Object());
    public static void main(String[] args) {
        MeuRunnable Runnable = new MeuRunnable();

        Thread t0 = new Thread(Runnable);
        Thread t1 = new Thread(Runnable);
        Thread t2 = new Thread(Runnable);

        t0.start();
        t1.start();
        t2.start();
    }

    public static class MeuRunnable implements Runnable {

        public void run() {
            String name = Thread.currentThread().getName();
            // System.out.println(name + ":" + i.incrementAndGet());
            // System.out.println(name + ":" + b.compareAndExchange(false, true));
            System.out.println(name + ":" + r.getAndSet(new Object()));
        }
    }
}
