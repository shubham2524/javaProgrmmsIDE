package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArraylistDemo {

	public static void main(String[] args) {
		// normal array
		int a[] = { 1, 2, 3, 4, 5, 6 };
		for (int ab : a) {
			System.out.println(ab);
		}
		System.out.println("---------------------");

		int arrs[] = new int[4];
		arrs[0] = 11;
		arrs[1] = 22;
		arrs[2] = 33;
		arrs[3] = 44;

		for (int number : arrs) {
			System.out.println(number);
		}

		// ArrayList is dynamic array
		// Actually ArrayList is the default class of java,so we cannot take class name
		// as ArrayList

		ArrayList<Object> list = new ArrayList<Object>();
		list.add("shubham");
		list.add("saurabh");
		list.add(3);
		list.add("shekhar");
		list.add("98.3");
		list.add(true);
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.size());
		System.out.println(0);// lowest INdex
		System.out.println(list.size() - 1);

		list.add("adding new object");
		System.out.println(list.size());
		System.out.println("==============================================");

		// Initial virtual capacity of ArrayList is 10,we can change the size of virtual
		// capacity by putting the size.
		// and physical capacity is 0

		// GENERIC ARRAYLIST
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(22);
		arr.add(45);
		arr.add(288);
		System.out.println(arr);
		System.out.println("=====================================================");

		ArrayList<String> name = new ArrayList<String>();
		name.add("shubham");
		name.add("swaty");
		name.add("sonam");
		System.out.println(name);
		System.out.println("=======================================================");

		// Iteration in array
		// 1
		for (String names : name) {
			System.out.println(names);

		}
		System.out.println("-------------------------");
		// 2
		// with the help of iterator
		Iterator<String> siblings = name.iterator();
		while (siblings.hasNext()) {
			System.out.println(siblings.next());

		}
		System.out.println("-------------------------");
		// 3 method
		// MOST important
		// with the help of JDK-8 STREAM WITH LEMBDA
		name.stream().forEach(ele -> System.out.println(ele));
		System.out.println("--------------------------------");

		// Second way to represent an array
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(22, 33, 44, 456));
		System.out.println(numbers);

		ArrayList<Integer> num = new ArrayList<Integer>(5);
		System.out.println(num.size());
		num.add(567);
		num.add(56);
		System.out.println(num.size());

	}

}
