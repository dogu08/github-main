package D2Ders14;

public class MyThread2 implements Runnable{

	@Override
	public void run() {
		try 
		{
			
		for(int i=0;i<5;i++)
		{
			System.out.println("Emek olmadan yemek olmaz");
			Thread.sleep(1_000);
		}
		}catch(Exception e)
		{
			System.out.println("Error:"+e.getMessage());
		}
		
	}

}
