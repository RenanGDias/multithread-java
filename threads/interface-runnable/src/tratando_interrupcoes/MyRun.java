package tratando_interrupcoes;

public class MyRun implements Runnable{
    public void run() {
        Thread t = Thread.currentThread();
        if (Thread.interrupted()) {
            System.out.println(t.getName() + " interrompido");
        }        
    }
}
