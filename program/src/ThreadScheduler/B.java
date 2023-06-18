package ThreadScheduler;

public class B {

	public static void main(String[] args) {
		A t1 = new A();
		t1.setName("Thread1 class");
		t1.setPriority(1);
		t1.start();
		A t2 = new A();
		t2.setName("Thread2");
		t2.start();
		t2.setPriority(4);
		for (int i = 1; i <=3; i++) 
		{
			System.out.println(Thread.currentThread().getName()+" is Running...");
		}
	}

}
