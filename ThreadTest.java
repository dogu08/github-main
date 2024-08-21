package D2Ders14;

public class ThreadTest {

	public static void main(String[] args) {
		
		Thread thread =new Thread();
		MyThread1 myObj1 = new MyThread1();
		MyThread2 myObj2 = new MyThread2();
		MyThread3 myObj3 = new MyThread3();
		
		Thread th = new Thread(myObj1);
		th.start();
		//th.setPriority(Thread.MAX_PRIORITY);
		
		Thread th2 = new Thread(myObj2);
		th2.start();
		//th2.setPriority(Thread.NORM_PRIORITY);
		
		Thread th3 = new Thread(myObj3);
		th3.start();
		//th3.setPriority(Thread.MIN_PRIORITY);
	}
}
