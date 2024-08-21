package D2Ders14;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class StringThread extends Thread{

	private List list;
	private String message;
	Lock lock =new ReentrantLock();
	
	public StringThread(List list, String message)
	{
		this.list=list;
		this.message=message;
		
	}
	
	public void run()
	{
		synchronized (list) {
			lock.lock();
		
		for(int i=0;i<message.length();i++)
		{
			list.add(message.charAt(i));
		}
		System.out.println("List:"+list);
		lock.unlock();
		}
		
	}
}
//Locked ve unlocked ile yapılır

//üretici ve tüketici problemi  (consumer prodecure)
