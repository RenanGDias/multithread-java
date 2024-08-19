package prioridade_threads;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1, t2;
        t1 = new MyThread("primeiro thread");
        t2 = new MyThread("segundo thread");
        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();
        
    }
}
