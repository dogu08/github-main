package D2Ders14;

public class TestPriority {

	public static void main(String[] args) {
		Thread th = new Thread();
		
		ThreadPriority th1 = new ThreadPriority(1000000000L);
		Thread thread = new Thread(th1);
		thread.setName("First Thread");
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.start();
		
		ThreadPriority th2 = new ThreadPriority(1000000000L);
		Thread thread2 = new Thread(th2);
		thread2.setName("Second Thread");
		thread2.setPriority(Thread.NORM_PRIORITY);
		thread2.start();
		
		ThreadPriority th3 = new ThreadPriority(1000000000L);
		Thread thread3 = new Thread(th3);
		thread3.setName("Third Thread");
		thread3.setPriority(Thread.MIN_PRIORITY);
		thread3.start();
		
	}
}
