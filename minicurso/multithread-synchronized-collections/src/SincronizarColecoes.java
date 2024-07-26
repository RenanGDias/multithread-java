import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SincronizarColecoes {

    private static List<String> lista = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException{
        lista = Collections.synchronizedList(lista);
        MeuRubbable runnable = new MeuRubbable();
        Thread t0 = new Thread(runnable);
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t0.start();
        t1.start();
        t2.start();

        Thread.sleep(500);
        System.out.println(lista);

    }

    public static class MeuRubbable implements Runnable {
        public void run() {
            // Possível solução: usar o bloco synchronized:
            // synchronized(this) {
                // lista.add("Inscreva-se no canal!");
            // }
            lista.add("Inscreva-se no canal!");
            String name = Thread.currentThread().getName();
            System.out.println(name + " inseriu na lista!");
        }
    }
}
