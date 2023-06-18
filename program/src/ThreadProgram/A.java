package ThreadProgram;

public class A extends Thread {
	@Override
	public void run()
	{
		try
		{
			for (int i = 0; i <=4; i++) 
			{
				System.out.println("Thread class is Running");
				Thread.sleep(2000);
			}
		}
		 catch(InterruptedException i)
		{
			
		}
		
	}

}


