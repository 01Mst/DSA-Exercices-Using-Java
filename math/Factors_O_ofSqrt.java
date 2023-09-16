package math;

public class Factors_O_ofSqrt {
	public static void main(String args[]) {
		int num=10;
		for(int i=1;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				if(num/i==i) {
					System.out.println(i+" ");
				}else {
			System.out.println(i+" "+num/i);
		}
	}
	}}}
