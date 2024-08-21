package D2Ders14;

public class ThreadExample3 extends Thread{

	ThreadExample2 th;
	
	@Override
	public void run() {
		
		System.out.println("I am "+ Thread.currentThread().getName());
		
		long number = Long.parseLong(th.text1.getText());
		long sum=0;
		
		//7 7+7+7+7+7+7+7
		for(long i=0;i<number;i++)
		{
			sum+=number;
		}
		th.lblEmpty.setText("Result:"+sum);
		
	}

}
