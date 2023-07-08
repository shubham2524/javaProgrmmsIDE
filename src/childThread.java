
public class childThread implements Runnable  {
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("child thread");
		
	}

}
