public class RunnableTask implements Runnable {
    int r;

    public RunnableTask(int r) {
        this.r = r;
    }

    public void run() {
        for (int i = 0; i < 100000; i++) {
            double res = 0;
            res = Math.pow(3, 5);
            
        }
    }
}
