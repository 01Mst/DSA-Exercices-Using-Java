package math;

public class NRM_SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=40;
		System.out.println(sqrt(num));

	}
	static double sqrt(double n) {
		double x=n;
		double root;
		while(true) {
			root=(x+(n/x))/2;
			if(Math.abs(root-x)<1) {
				break;
			}
			x=root;
		}
		return root;
	}

}
