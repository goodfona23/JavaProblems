package intwo;



public class Case1 {
//print value at even and odd places
	public static void print(String[] str) {
		
		System.out.println("Even values ");
		for(int i=0;i<str.length;i+=2) {
			System.out.print(str[i]+" ");
		}
		System.out.println("");
		System.out.println("odd values ");
		for(int i=1;i<str.length;i+=2) {
			System.out.print(str[i]+ " ");
		}
		
		
	}
	public static void main(String[] args) {
		
		String[] n= {"Java","C++","Python","PHP","REACT","ANGULAR"};
		print(n);
		/*
		 * int[] array = {10, 20, 30, 40, 50, 60};
		 * 
		 * for (int i = 0; i < array.length; i += 2) { System.out.println(array[i]); }
		 */
	}
}
