package in;

import java.util.HashMap;

public class Case5 {

	// Character occurrence in a string
	public static void findNoOfOccurrence(String s) {
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (char ch : s.toCharArray()) {
			if (charCount.containsKey(ch)) {
				charCount.put(ch, charCount.get(ch) + 1);
			} else {
				charCount.put(ch, 1);
			}
		}
		System.out.println(charCount);

	}

	public static void main(String[] args) {
		//char c = 'a';
		findNoOfOccurrence("dhananjay");
	}
}
