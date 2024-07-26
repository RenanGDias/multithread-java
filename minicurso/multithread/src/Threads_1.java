public class Threads_1 {
    public static void main(String[] args) throws Exception {
        // Thread atual
        Thread t = Thread.currentThread();
        System.out.println(t.getName());

        MeuRunnable meuRunnable = new MeuRunnable();

        // Nova thread
        Thread t1 = new Thread(meuRunnable);

        // Runnable como função lambda
        Thread t2 = new Thread(
                () -> System.out.println(Thread.currentThread().getName()));
        
        // t2.start(); --> Vai lançar Exceção!

        // Várias threads
        Thread t3 = new Thread(meuRunnable);

        t1.start();
        t2.start();
        t3.start();
    }
}
