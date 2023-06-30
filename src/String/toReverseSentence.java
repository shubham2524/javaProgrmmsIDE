package String;

// wap to reverse a sentance "my name is khan"
public class toReverseSentence {

	public static void main(String[] args) {

		String s = "my name is khan";
		String[] arr = s.split(" ");
		
		for (int i = arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}

		}

	}


