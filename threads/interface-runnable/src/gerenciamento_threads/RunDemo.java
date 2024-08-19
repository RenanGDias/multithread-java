package gerenciamento_threads;

public class RunDemo {
    public static void main(String[] args) {
        MyRun r;
        Thread m, t1, t2;
        r = new MyRun();
        t1 = new Thread(r);
        t2 = new Thread(r);
        m = Thread.currentThread();
        System.out.println(m.getName() + ": " + m.threadId());
        t1.start();
        t2.start();
        
    }
}
