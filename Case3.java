package in;

public class Case3 {
	public static int findLargestValue(int[] a) {
		// {2,10,3,11,9}
		int num = a[0];
		for (int i = 0; i < a.length; i++) {
			if (num < a[i]) {
				num = a[i];
			}
		}
		System.out.print("Largest number ");
		return num;
	}

	public static int findSmallestNumber(int[] a) {
		int num = a[0];
		for (int i = 0; i < a.length; i++) {
			if (num > a[i]) {
				num = a[i];

			}

		}
		System.out.print("Smallest number ");
		return num;
	}

	public static void main(String[] args) {
		int[] a = { 2, 101, 3, 11, 9 ,12,1};
		System.out.println(findLargestValue(a));
		System.out.println(findSmallestNumber(a));
	}
	
}
