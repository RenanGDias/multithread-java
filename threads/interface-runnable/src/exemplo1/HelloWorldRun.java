package exemplo1;
public class HelloWorldRun implements Runnable {

    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        HelloWorldRun r = new HelloWorldRun();
        Thread t = new Thread(r);
        t.start();
    }
}
