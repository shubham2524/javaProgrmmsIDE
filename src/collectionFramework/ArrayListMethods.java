package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("java");
		ar1.add("python");
		ar1.add("c++");

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("java script");
		ar2.add("Devops");
		ar2.add("Testing");

		// addAll()
		// adding another arrayList
		ar1.addAll(ar2);
		System.out.println(ar1);

		
		//adding elements from index 2
		ar1.addAll(2, ar2);
		System.out.println(ar1);

		// clear()
		// it will clear all the element 
		ar2.clear();
		System.out.println(ar2);

		// clone()
		// means identical array
		ArrayList<String> cloneList = (ArrayList<String>) ar1.clone();
		System.out.println(cloneList);

		// contains()
		//check weather element is present in the array
		// return boolean value
		System.out.println(ar1.contains("java"));
		System.out.println(ar1.contains("c#"));

		// indexOf();
		// find the index of elements
		System.out.println(ar1.indexOf("c++"));
		System.out.println(ar1.indexOf("java") > 0);

		// lastIndexOf();
		// count last index from the element
		System.out.println(ar1.lastIndexOf("python"));

		// remove()
		// used to remove the element
		System.out.println(ar1.remove(1));
		System.out.println(ar1);
		
		//removeIf()
		//here you can apply some conditions
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
		num.removeIf(evenno -> evenno%2 != 0);
		System.out.println(num);
		
		
		
		//retainAll()
		ar1.retainAll(Collections.singleton("java"));
		System.out.println(ar1);
		
		//subList()
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		ArrayList<Integer> sublist = new ArrayList<Integer>(numbers.subList(3, 5));
		System.out.println(sublist);
		
		
		//toArray();
		ArrayList<String> name = new ArrayList<>(Arrays.asList("shubham","saurabh","swaty","sonam","raubinsh"));
		Object arr[] = name.toArray();
		System.out.println(Arrays.toString(arr));
		
		for(Object o :arr) {
			System.out.println((String)o);
		}
		
	}

}
