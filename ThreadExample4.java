package D2Ders14;

public class ThreadExample4 {

	public static void main(String[] args) {
		
	
		try 
		{
			
		for(int i=0;i<5;i++)
		{
			System.out.println("İşleyene demir pas tutmaz");
			Thread.sleep(1_000);
		}
		}catch(Exception e)
		{
			System.out.println("Error:"+e.getMessage());
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("Emek olmadan yemek olmaz");
			
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Bir elin nesi var,iki elin sesi var");
		}
	}
}
