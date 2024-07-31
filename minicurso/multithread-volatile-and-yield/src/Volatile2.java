import java.lang.Thread.State;

public class Volatile2 {

    // private static int numero = 0;
    // private static boolean preparado = false;
    private static volatile int numero = 0;
    private static volatile boolean preparado = false;

    private static class MeuRunnable implements Runnable{

        public void run() {
            while(!preparado) {
                Thread.yield();
            }

            if(numero != 42) {
                throw new IllegalStateException("Inscreva-se no canal!");
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        while (true) {
            Thread t0 = new Thread(new MeuRunnable());
            t0.start();
            Thread t1 = new Thread(new MeuRunnable());
            t1.start();
            Thread t2 = new Thread(new MeuRunnable());
            t2.start();

            numero = 42;
            preparado = true;

            while (
                t0.getState() != State.TERMINATED || t1.getState() != State.TERMINATED || t2.getState() != State.TERMINATED
            ) {
                // Em espera
            }

            numero = 0;
            preparado = false;

        }
    }
}
