package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> nameList = Collections.synchronizedList(new ArrayList<String>());
		nameList.add("java");
		nameList.add("python");
		nameList.add("ruby");
		
		//to add or remove --we don't need explicit synchronization
		
		//but to fetch value --- we need to use explicit Synchronization
		
		synchronized (nameList) {
		Iterator<String>  it = 	nameList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			
		}
		//copyOnWriteArrayList---it is the class
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		
		empList.add("shubam");
		empList.add("shekhar");
		empList.add("naveen");
		//we don't need any explicit synchronization because here everything is synchronized
		
		Iterator<String> it = empList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
