package exemplo3;

public class HelloWorldAlive extends Thread {

    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        System.out.println("Iniciando ...");
        HelloWorldAlive t = new HelloWorldAlive();
        t.start();
        System.out.println(t.getPriority());
        while (t.isAlive()) {
            System.out.println("Terminando ...");
        }
    }
}
