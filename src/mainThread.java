
public class mainThread {

	public static void main(String[] args) {
		
		
		childThread c = new childThread();
		 Thread t = new Thread(c);
		 Thread t1 = new Thread();
		 t.start();
		 t1.start();
		 
		 
		 System.out.println("main thread");
		 System.out.println(Thread.currentThread().getName());
		 
		 

	}

}
