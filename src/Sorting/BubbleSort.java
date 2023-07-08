package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = { 2, 999, 67, 89, 100, 45, 223, 49, 0, 4678 };

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int tempt = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tempt;
				}
			}
		}
		System.out.print("sotted array  :-");
		for (int o = 0; o < a.length; o++) {
			System.out.print(a[o] + " ");
		}

	}

}
