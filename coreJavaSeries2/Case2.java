package intwo;

public class Case2 {
//check if array is sorted
	
	public static void checking(int[] num) {
		boolean isSorted=true;
		
		for(int i=0;i<num.length-1;i++) {
			if(num[i]>num[i+1]) {
				isSorted=false;
				break;
			}
		}
		System.out.println("isSorted "+isSorted);
	}
	
	public static void main(String[] args) {
		int[] n= {23,34,45,67,87,98};
		int[] n1= {5,2,67,1};
		checking(n);
		checking(n1);
	}
}
