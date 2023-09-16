package math;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4, b=8;
		System.out.println(gcd(a,b));

	}
	static int gcd(int a, int b) {
		if(a==0) {
			return b;
		}
		return gcd(b%a,a);
	}
}
