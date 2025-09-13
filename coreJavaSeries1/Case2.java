package in;

public class Case2 {
	//Swap 2 Number
	public static void swapping(int a , int b) {
		a=a+b;//a=30
		b=a-b; //30-20 i.e b=10
		a=a-b;//30 -10 i.e a=20
		System.out.println("After Swap "+"a : "+a+" b : "+b);
		
		
	}
	
	public static void xorSwap(int a , int b) {
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("XOR  Swap "+"a : "+a+" b : "+b);
	}
	public static void main(String[] args) {
		int a=10;
		int  b=20;
		System.out.println("Before Swap "+"a : "+a+" b : "+b);
		swapping(a, b);
		
		xorSwap(a, b);
	}

}
