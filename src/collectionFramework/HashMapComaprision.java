package collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapComaprision {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map1 = new HashMap<Integer,String>();
		map1.put(1,"A");
		map1.put(2,"B");
		map1.put(3,"C");
		
		HashMap<Integer, String> map2 = new HashMap<Integer,String>();
		map2.put(1,"A");
		map2.put(3,"C");
		map2.put(2,"B");
		
		
		HashMap<Integer, String> map3 = new HashMap<Integer,String>();
		map3.put(1,"A");
		map3.put(3,"C");
		map3.put(2,"B");
		map3.put(3,"D");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("A",1);
		map.put("B",2);
		map.put("c",3);
		
		
		HashMap<Integer, String> map4 = new HashMap<Integer,String>();
		map4.put(1,"A");
		map4.put(3,"C");
		map4.put(2,"B");
		map4.put(4,"D");
		
		//on the basis of key and value pair
		System.out.println(map1.equals(map2));
		System.out.println(map2.equals(map3));
		System.out.println(map1.equals(map));
		
		
		//on the basis of key set 
		System.out.println(map1.keySet().equals(map2.keySet()));
		
		
		//**find the extra keys 
		HashSet<Integer> combinedKeys = new HashSet<>(map1.keySet());
		combinedKeys.addAll(map4.keySet());
		combinedKeys.removeAll(map1.keySet());
		System.out.println(combinedKeys);
		
		
		
		//on the basis of comapare by values
		HashMap<Integer, String> map5 = new HashMap<Integer,String>();
		map5.put(1,"A");
		map5.put(2,"B");
		map5.put(3,"C");
		
		HashMap<Integer, String> map6 = new HashMap<Integer,String>();
		map6.put(4,"A");
		map6.put(5,"B");
		map6.put(6,"C");
		
		
		HashMap<Integer, String> map7 = new HashMap<Integer,String>();
		map7.put(1,"A");
		map7.put(2,"C");
		map7.put(3,"B");
		map7.put(4,"C");
		
		
		//duplicates are not allowed
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));
		
		//duplicats are allowed using hasset
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));
		
		
	
		
		
		
		
		
		
	}

}
