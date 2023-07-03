package String;

public class countNoOfRepeatedWordsInSentence {

	public static void main(String[] args) {

		String[] s = "twinkle twinkle liitle star twinkle twinkle".split(" ");

		String repWord = "twinkle";

		int count = 0;

		for (int i = 0; i < s.length; i++) {
			if (repWord.equals(s[i])) {
				count++;
			}
		}
		System.out.println(count);
	}
}
