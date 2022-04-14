package longestword;

import java.util.Scanner;

public class Main {

	public static String LongestWord(String sen) {
		String[] senArray = sen.split("[^a-z^0-9]");

		int longestIndex = 0;
		String longestWord = "";

		for (int i = 0; i < senArray.length; i++) {
			if (senArray[i].length() > longestIndex) {
				longestWord = senArray[i];
				longestIndex = senArray[i].length();
			}
		}
		return longestWord;
	}

	

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner("I love dogs");
		System.out.print(LongestWord(s.nextLine()));
	}

}
