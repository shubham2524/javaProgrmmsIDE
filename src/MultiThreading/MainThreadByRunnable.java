package MultiThreading;

public class MainThreadByRunnable {

	public static void main(String[] args) {
		ChildThreadByRunnable c = new ChildThreadByRunnable();
		
		//there is no start methord in Runna]ble interface  so it will not work
		//c.start();
		
		
		Thread t = new Thread(c);
		t.start();
	
		//t.start();
		//here it will start the thread run()which has empty implementation, so to start the run()
		//of childthread runnale 
		//we need to pass the refrance of object of child thread runnable in thread constructor .
		
		for (int i=0;i<100;i++) {
		System.out.println("main method");
		
		
		}

	}

}
