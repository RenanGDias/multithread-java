public class Synchronized_1 {

    static int i = -1;

    public static void main(String[] args) {
        MeuRunnable Runnable = new MeuRunnable();

        Thread t0 = new Thread(Runnable);
        Thread t1 = new Thread(Runnable);
        Thread t2 = new Thread(Runnable);
        Thread t3 = new Thread(Runnable);
        Thread t4 = new Thread(Runnable);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    /*
     * public static void imprime() {
     * synchronized (Synchronized_1.class) {
     * i++;
     * String name = Thread.currentThread().getName();
     * System.out.println(name + ":" + i);
     * }
     * }
     */

    public static class MeuRunnable implements Runnable {
        // static Object lock1 = new Object();
        // static Object lock2 = new Object();

        // public synchronized void run() {
        public synchronized void run() {
            // imprime();
            // synchronized(this) {
            i++;
            String name = Thread.currentThread().getName();
            System.out.println(name + ":" + i);
            // }

            /*
             * synchronized (lock1) {
             * i++;
             * String name = Thread.currentThread().getName();
             * System.out.println(name + ":" + i);
             * }
             * synchronized (lock2) {
             * i++;
             * String name = Thread.currentThread().getName();
             * System.out.println(name + ":" + i);
             * }
             */

        }
    }
}
