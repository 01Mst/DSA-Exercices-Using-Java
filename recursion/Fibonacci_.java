package recursion;

public class Fibonacci_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(fibo(4));
	}
	static int fibo(int num) {
		if(num<2) {
			return num;
		}
		return fibo(num-1)+fibo(num-2);
	}

}
