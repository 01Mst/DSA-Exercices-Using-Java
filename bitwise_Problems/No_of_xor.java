package bitwise_Problems;

public class No_of_xor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println(xor(b)^xor(a-1));
	}
	static int xor(int a) {
		if(a%4==0) {
			return a;
		}if(a%4==1) {
			return 1;
		}if(a%4==2) {
			return a+1;
		}
		return 0;
	}}