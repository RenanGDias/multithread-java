package exemplo1;
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1, t2;
        t1 = new MyThread("primeiro thread");
        t2 = new MyThread("segundo thread");
        t1.start();
        t2.start();
    }
}