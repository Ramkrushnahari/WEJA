package ThreadRunnable;

public class B {

	public static void main(String[] args) {
		A ir = new A();
		Thread t = new Thread(ir);
		t.start();
		for (int i = 0; i <=4; i++)
		{
			System.out.println("main thread is Running");
		}
		
	}

}
