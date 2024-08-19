package tratando_interrupcoes;

public class RunDemo {
    public static void main(String[] args) {
        MyRun r;
        Thread t1, t2;
        r = new MyRun();
        t1 = new Thread(r);
        t2 = new Thread(r);
        t1.start();
        t2.start();
        t1.interrupt();
    }
}
