package math;

public class PrimeNumbers_Between {

	public static void main(String[] args) {
		int num=40;
		boolean primes[]=new boolean[num+1];
		//System.out.println(primes[2]);
		seive(num, primes);
	}
	static void seive(int num, boolean primes[]) {
		for(int i=2;i*i<=num;i++) {
			if(!primes[i]) {
				for(int j=i*2;j<=num;j=j+i) {
					primes[j]=true;
				}
			}
		}
		for(int i=2;i<=num;i++) {
			if(!primes[i]) {
				System.out.print(i+" ");
				
			}
		}
	}
	
}