package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsfromArrayList {

	public static void main(String[] args) {
		
		
		//By using linkHashSet
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(2,3,4,56,7,89,98,89,7,6,54,4,3,21));
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
		System.out.println(linkedHashSet);
		
		
		ArrayList<String> name = new ArrayList<String>(Arrays.asList("shuham","saurabhb","swaty","singh","Ankita","shalvi"));
		LinkedHashSet<String> finalList = new LinkedHashSet<String>(name);
		System.out.println(finalList);
		
		
		
		//By using JDK-8 Steam
		ArrayList< Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,6,4,3,2,1));
		List<Integer>list = num.stream().distinct().collect(Collectors.toList());
		System.out.println(list);
		
		
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("shubham","sauarabh","singh","swaty","sonam","bsant"));
		List<String> finalLists = names.stream().distinct().collect(Collectors.toList());
		System.out.println(finalLists);
	
		
		
	}

}
