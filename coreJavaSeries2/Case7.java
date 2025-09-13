package intwo;

import java.util.Arrays;

public class Case7 {
	//Sort an Array without using Arrays.sort();
	public static void bubbleSort(int[] a) {
		
		int n=a.length;
		boolean swapped;
		
		for(int i=0;i<n-1;i++) {
			
			swapped=false;
			for(int j=0;j<n-i-1;j++) {
				System.out.println(" ");
				System.out.println(Arrays.toString(a));
				if(a[j]>a[j+1]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					swapped=true;
					System.out.println(a[j]+" <-- Swap ---> " +a[j+1]);
				}
				
				
			}
			if(!swapped) {
				break;
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		int[] a= {23,2,67,8,1,5};
		bubbleSort(a);
	}
}
