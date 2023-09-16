package bitwise_Problems;

public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
		int last=0;
		int base=5;
		int ans=0;
		while(num>0) {
			last=num&1;
			num=num>>1;
			ans=ans+last*base;
			base=base*5;
		}
		System.out.println(ans);
	}

}
