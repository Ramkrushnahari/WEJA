package ThreadRunnable;

public class A implements Runnable {
	@Override
	public void run()
	{
		for (int i = 0; i <=4; i++) 
		{
			System.out.println("Runnable Interface is Running");
		}
		
	}

}
