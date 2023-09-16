package bitwise_Problems;

public class A_Power_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		int b=3;
		int ans=1;
		while(a>0) {
			if((a&1)==1) {
				ans=ans*b;
			}
			b=b*b;
			a=a>>1;
		}
		System.out.println(ans);
	}

}
