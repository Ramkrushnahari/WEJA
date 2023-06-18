package ThreadScheduler;

public class A extends Thread {
	public void run() {
		for (int i = 1; i <=3; i++) 
		{
			System.out.println(Thread.currentThread().getName()+" is Running...");
		}
	}

}
