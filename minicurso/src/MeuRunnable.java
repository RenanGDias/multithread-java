public class MeuRunnable implements Runnable {

	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name);
	}

}
