package in;

public class Case {
	// Reverse a given String
	public static String reverse(String Original) {
		StringBuilder sb = new StringBuilder(Original);
		String reverse = sb.reverse().toString();

		return reverse;
	}

	public static void main(String[] args) {
		System.out.println(reverse("Hello"));

	}
}
