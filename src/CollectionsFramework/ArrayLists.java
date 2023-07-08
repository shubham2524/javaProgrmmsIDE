package CollectionsFramework;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayLists {
	
	// ArrayList is default class
	// it is dynamic array 
	//vartual size of array = 10
	

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(0, 1);
		list.add(3, 4);
		
		list.remove(3);
		System.out.println(list);
		int size = list.size();
		System.out.println(size);
		System.out.println(list.get(0));
		ArrayList<String> namelist = new ArrayList<>();
		namelist.add("shubham");
		namelist.add(1, "saurabh");
		System.out.println(namelist);
		ArrayList<Object> lists = new ArrayList<Object>();
		lists.add("shubhamsaurabh");
		lists.add(256);
		lists.add(list);
		list.add(56789);
		System.out.println(lists.get(2));
		
		
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("shubam");
		name.add("saurabh");
		name.add("rohit");
		name.add("vikash");
		name.add("mohan");
		name.add("ram");
		//simple for loop
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i)+" ");
		}
		//foreach loop
		for(String s : name) {
			System.out.print(s+" ");
		}
		
		//or 
		
		ArrayList< String> language = new ArrayList<String>(Arrays.asList("tmail","hindi","urdu"));
		System.out.println(language);
		//System.out.println(language.get(6)); array out of bounds exception
		
		
		//Methors of Arraylist 
		
		ArrayList<String> arr = new ArrayList<String>();
		
		//add()
		arr.add("shubham");
		arr.add("rauinsh");
		arr.add("shekhar");
		name.add("shubam");
		name.add("saurabh");
		name.add("rohit");
		name.add("vikash");
		
		
		//addAll
		arr.addAll(name);
		System.out.println(arr);
		System.out.println("========================");
		
		
		//get()
		System.out.println(arr.get(0));
		
		
		//size()
		System.out.println(arr.size());
		
		
		//remove();
		System.out.println(arr.remove(3));
		
		//removeAll();
		System.out.println(arr.removeAll(name));
		
		
		//contains
		System.out.println(arr.contains("shubham"));
		
		//clear()
		arr.clear();
		
		System.out.println(arr);
		
		
		//Synchronized/thread safe means one thread at atime
		// by default arraylist is unsenchronized 
		//but we can screnchronized the array list by :-
		
		//1. copyOnWriteArrayList (class)
		
		CopyOnWriteArrayList<String> synarr  = new CopyOnWriteArrayList<String>();
		synarr.add("java");
		synarr.add("ruby");
		synarr.add("python");
		synarr.add("csharp ");
		
		for(String lang : synarr) {
			System.out.print(lang+" ");
		}
		
		//collectionList.synchronizedList
		
		List<String> fruit = Collections.synchronizedList(new ArrayList<String>());
		fruit.add("mango");
		fruit.add("apple");
		fruit.add("banana");
		
		synchronized (fruit) {
			for(String fruits: fruit) {
				System.out.print(fruits+" ");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
