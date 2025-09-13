package intwo;

public class Case6 {
//find the missing number in sequence
	public static void missingNum(int[] arr,int n) {
		int sum=0;
		for(int s:arr) {
			sum+=s;
		}
		int exsum=n*(n+1)/2;//linear progression
		
		System.out.println(exsum-sum);
	}
	
	public static void main(String[] args) {
		int[] num= {2,1,4,5};
		missingNum(num, 5);
	}
}
