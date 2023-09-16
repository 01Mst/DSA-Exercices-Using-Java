package math;

public class Prime_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=20;
		for(int i=1;i<=num;i++) {
			System.out.println(i+" "+isPrime(i));
		}

	}
	static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		int c=2;
		while(c*c<=num) {
			if(num%2==0) {
				return false;
			}
			c++;
		}
		return true;
	}
}
