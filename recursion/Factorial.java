package recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int ans=fact(5);
		System.out.println(fact(5));
	}
	static int fact(int num) {
		if(num<=1) {
			return 1;
		}
		return num*fact(num-1);
	}

}
