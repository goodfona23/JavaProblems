package in;

public class Case9 {
	
	//1234
	public static int sumOfDigit(int num) {
		
		if(num!=0)
		return num%10 +sumOfDigit(num/10);
		return num;
	}

	public static void main(String[] args) {
		System.out.println(sumOfDigit(1234510));
	}
}
