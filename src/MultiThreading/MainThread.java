package MultiThreading;

public class MainThread {

	public static void main(String[] args) {

		ChildThread ct = new ChildThread();

		 ct.start();

		// from here two thread is running
		// 1. main thread
		// 2. child thread

		for (int i = 0; i < 10; i++) {
			System.out.println("main thread ");
		}

	}

}
