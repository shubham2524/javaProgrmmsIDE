package array;

import java.util.Scanner;

public class arrayWithScannerClass {
	public static void A1(int b[]) {
		System.out.println("The elements are");
		for(int i=0;i<b.length;i++) {
		System.out.println(b[i]);
		}
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of aray you want to create");
		int size = sc.nextInt();
		int a [] = new int [size];
		System.out.println("enter the elements");
		for(int i =0;i<a.length;i++) {
			a[i] = sc.nextInt();
			
			
		}
		A1(a);
//		for(int array : a) {
//			System.out.print("{"+array +"}");
//		}
//		
		
		

		
		
		
		

	}
	
	

}
