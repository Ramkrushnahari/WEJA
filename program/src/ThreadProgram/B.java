package ThreadProgram;

public class B {
	public static void main(String[] args) throws InterruptedException {
		A t =new A();
		t.start();
		for (int i = 0; i <=4; i++)
		{
			System.out.println("main thread is Running");
			Thread.sleep(2000);
		}
		}	
	}

