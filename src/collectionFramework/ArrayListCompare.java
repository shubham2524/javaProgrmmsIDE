package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		// 1. sort and equals

		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));

		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "E", "D"));

		Collections.sort(l1);
		Collections.sort(l2);
		System.out.println(l1.equals(l2));

		// 2. find out additional element
		l1.removeAll(l2);
		System.out.println(l1);

		// 3.find the missing elements
		l2.removeAll(l1);

		// 4.find the common elements
		
		ArrayList<String> fruits1 = new ArrayList<String>(Arrays.asList("mango","banana","apple","astraberi"));
		ArrayList<String> fruits2 = new ArrayList<String>(Arrays.asList("mango","gavava","banana","apple"));
		fruits1.retainAll(fruits2);
		fruits2.retainAll(fruits1);
		System.out.println(fruits1);
		System.out.println(fruits2);

	}

}
