package bitwise_Problems;

public class Odd_Even {//Problem can identify is odd or not?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=91;
		System.out.println(isodd(n));
	}

	private static boolean isodd(int n) {
		// TODO Auto-generated method stub
		return (n&1)==1;
	}

}
