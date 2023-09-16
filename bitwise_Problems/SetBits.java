package bitwise_Problems;

public class SetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		
		int count=0;
		while(a>0) {
			if((a&(a-1))==0) {
				count++;
					}
			a=a>>1;
			}
	System.out.println(count);

	}

}
