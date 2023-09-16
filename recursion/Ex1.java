package recursion;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method(1);
	}
	static void method(int num) {
		if(num==5) {
			System.out.println(num);
			return;}
		System.out.println(num);
		method(num+1);
	}
	
	

}
