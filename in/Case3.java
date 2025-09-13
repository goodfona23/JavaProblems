package intwo;

public class Case3 {
//find Second largest number in an array
	public static void secondLargest(int[] a) {
		int num =0;
		int sec=0;
		for(int i:a) {
			if(i>num) {
				sec=num;
				num=i;
			}
			
		}
		System.out.println(sec);
	}
	
	public static void main(String[] args) {
		int[] n1= {23,1,97,67,3,8,91,2,0,98,34};
		secondLargest(n1);
	}
}
