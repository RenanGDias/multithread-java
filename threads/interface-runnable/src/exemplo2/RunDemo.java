package exemplo2;

public class RunDemo {
    public static void main(String[] args) {
        MyRun r1, r2;
        Thread t1, t2;
        r1 = new MyRun("primeiro thread");
        r2 = new MyRun("segundo thread");
        t1 = new Thread(r1);
        t2 = new Thread(r2);
        if (t1.isAlive()) {
            System.out.println(t1.getName() + " está rodando");
        }
        t1.start();
        t2.start();
    }
}
