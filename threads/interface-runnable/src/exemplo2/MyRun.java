package exemplo2;

public class MyRun implements Runnable {

    private String message;
    
    public MyRun(String m) {
        message = m;
    }
    
    public void run() {
        for(int r = 0; r < 10; r++) {
           System.out.println(message); 
        }
    }
    
}
