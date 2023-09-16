package bitwise_Problems;

public class FindBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=16;
		int count=0;
		while(num>0) {
			count++;
			num=num>>1;
		}
		System.out.println(count);
	}

}
