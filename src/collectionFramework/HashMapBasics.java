package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {
	// store data in key and value pair(K,V)
	// no ordering
	// on duplicate
	// infinite null value but 1 null key
	// hashMap is thread safe

	public static void main(String[] args) {
		HashMap<String, String> phonecode = new HashMap<String, String>();
		phonecode.put("india", "+91");
		phonecode.put("USA", "+1");
		phonecode.put("UK", "+43");
		phonecode.put("UK", "+44");
		phonecode.put(null, "+95");
		phonecode.put(null, "+84");// update
		phonecode.remove(null);

		System.out.println(phonecode.get("USA"));
		System.out.println(phonecode.get("india"));
		System.out.println(phonecode.get("UK"));
		System.out.println(phonecode.get(null));// here updated value will print

		// Iterator for indexing
		Iterator<String> it = phonecode.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = phonecode.get(key);
			System.out.println("key = " + key + " & value = " + value);
		}
		System.out.println("-----------------------------------------");

		// iterator over the set pair by using entryset

		Iterator<Entry<String, String>> it1 = phonecode.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<String, String> entry = it1.next();
			System.out.println("key = "+entry.getKey()+" value = "+entry.getValue());
		}
		
		System.out.println("---------most important and easy");

		// Iterate by using java jdk 8 by for each loop and lambda
		phonecode.forEach((k, v) -> System.out.println("key = " + k + " value = " + v));

	}

}
