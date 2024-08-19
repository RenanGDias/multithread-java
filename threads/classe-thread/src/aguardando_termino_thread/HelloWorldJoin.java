package aguardando_termino_thread;

public class HelloWorldJoin extends Thread {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Hello World");
        }
    }

    public static void main(String[] args) {
        System.out.println("Iniciando...");
        HelloWorldJoin t = new HelloWorldJoin();
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Terminando...");
    }
}
