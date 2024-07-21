public class Threads_1 {
    public static void main(String[] args) throws Exception {
        // Thread atual
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        
        // Nova thread
        Thread t1 = new Thread(new MeuRunnable());
        t1.start();
    }
}
