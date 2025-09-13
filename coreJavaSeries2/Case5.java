package intwo;

import java.util.Arrays;

public class Case5 {
//Check if 2 string are anagram or not
	//listen and silent 
	//triangle integral
	
	public static void checkAnagram(String s1 ,String s2) {
		
		boolean flag=true;
		//remove all spaces and convert to lower case
		s1.replaceAll("\\s", "").toLowerCase();
		s2.replaceAll("\\s", "").toLowerCase();
		
		
		System.out.println(s1);
		System.out.println(s2);
		//check length
		System.out.println("before If"+flag);
		if(s1.length()!=s2.length()) {
			
			flag=false;
		}
		//sort
		char[] ch=s1.toCharArray();
		char[] ch1=s2.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(ch1));
		System.out.println("before Equals"+flag);
		flag=Arrays.equals(ch, ch1);
		
		System.out.println("result of checking anagram is "+flag);
		
		
		
		
	}
	
	public static void main(String[] args) {
		checkAnagram("listen", "silent");
	}
}
