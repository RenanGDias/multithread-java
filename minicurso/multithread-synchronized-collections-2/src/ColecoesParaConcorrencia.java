import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ColecoesParaConcorrencia {

    // private static List<String> lista = new CopyOnWriteArrayList<>(); // Essa
    // classe é Thread-safe
    // private static Map<Integer, String> mapa = new ConcurrentHashMap<>();
    private static BlockingQueue<String> fila = new LinkedBlockingQueue<>();

    public static void main(String[] args) throws InterruptedException {
        MeuRunnable runnable = new MeuRunnable();
        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t0.start();
        t1.start();
        t2.start();

        Thread.sleep(500);
        // System.out.println(lista);
        // System.out.println(mapa);
        System.out.println(fila);

    }

    public static class MeuRunnable implements Runnable {
        public void run() {
            // lista.add("Inscreva-se no canal!");
            // mapa.put(new Random().nextInt(), "Curta esse vídeo!");
            fila.add("Se tiver condições, torne-se um apoiador do canal!");
            String name = Thread.currentThread().getName();
            System.out.println(name + " inseriu no mapa!");
        }
    }
}
