package in;

public class Case1 {
	// check if a string a Palindrome
	public static boolean checkPalindrome(String s) {
		Boolean check = false;
		// madam
		StringBuilder sb = new StringBuilder(s);
		String newString = sb.reverse().toString();
		if (s.equalsIgnoreCase(newString)) {
			check = true;
			System.out.println(s+" is palindrome");
		}

		return check;

	}
//another approach
	public static boolean checkIfPalindrome(String p) {
		String d= p.toLowerCase();
		Boolean checking =true;
		for(int i=0; i <d.length();i++) {
			if(d.charAt(i)!=d.charAt(d.length()-i-1)) {
				checking=false;
				
			}
		}
		if(checking) {
			System.out.println(d +" is palindrome");
		}
		return checking;
		
		
	}
	public static void main(String[] args) {
		
		//System.out.println(checkPalindrome("MAdam"));
		
		System.out.println(checkIfPalindrome("Test"));
		System.out.println(checkIfPalindrome("Teset"));
		
		
	}
}
