package in;

public class Case7 {
	
	//factorial
	public static int factorial(int Fnum) {
		if(Fnum==0 || Fnum==1) {
			return 1;
		}
		return Fnum*factorial(Fnum-1);
	}
		
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
}
