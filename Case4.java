package in;

public class Case4 {
	public static void countVowelAndConsonant(String s) {
		// Dhananjay
		int countVowel = 0;
		int countConso = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'i' || s.charAt(i) == 'e' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				countVowel++;
			} else {
				countConso++;
			}
		}
		System.out.println("countVowel " + countVowel);
		System.out.println("countConso " + countConso);
	}

	public static void main(String[] args) {
		countVowelAndConsonant("Vowel".toLowerCase());
	}
}
