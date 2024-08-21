package D2Ders14;

public class ThreadPriority implements Runnable{

	private long value;
	
	public ThreadPriority(long value)
	{
		this.value=value;
	}
	
	@Override
	public void run() {
		
	
		long startTime=System.currentTimeMillis();
		long sum=0;
		
		//7 7+7+7+7+7+7+7
		for(long i=0;i<value;i++)
		{
			sum+=value;
		}
		System.out.println("Result:"+sum);
		
		long takenTime = System.currentTimeMillis()-startTime;	
		
		System.out.println("Elapsed time: " +takenTime+ " for thread "+Thread.currentThread().getName());
		}

}
