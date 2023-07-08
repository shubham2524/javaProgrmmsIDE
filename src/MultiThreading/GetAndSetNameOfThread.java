package MultiThreading;

public class GetAndSetNameOfThread {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());// By default it is 'main'
		Thread.currentThread().setName("shubham main thread ");
		System.out.println(Thread.currentThread().getName());
		
		ChildThread c = new ChildThread();
		System.out.println(c.getName()); // by default it is Thread-0

	}

}
