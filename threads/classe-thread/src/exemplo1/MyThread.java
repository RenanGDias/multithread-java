package exemplo1;
public class MyThread extends Thread {
    private String message;
    
    public MyThread(String m) {
        message = m;
    }
    
    public void run() {
        for(int r = 0; r < 10; r++) {
           System.out.println(message); 
        }
    }
}