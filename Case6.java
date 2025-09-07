package in;



public class Case6 {
	
//Fibonacci series 	
	
	public static void fibo(int n) {
		
		
		int a=0;
		int b=1;
		System.out.print(a+",");
		System.out.print(b+",");
		for(int i=0;i<n;i++) {
		int temp=a+b;
		System.out.print(temp+",");
		a=b;
		b=temp;
		}
		
		
	}

	public static void main(String[] args) {
		fibo(10);
	}
}
