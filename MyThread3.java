package D2Ders14;

public class MyThread3 implements Runnable{

	@Override
	public void run() {
		
		try 
		{
			
		for(int i=0;i<5;i++)
		{
			System.out.println("Bir elin nesi var,iki elin sesi var");
			Thread.sleep(1_000);
		}
		}catch(Exception e)
		{
			System.out.println("Error:"+e.getMessage());
		}
	}

}
