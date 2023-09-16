package math;

public class SquareRoot_BS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=40;
		int p=3;
		System.out.println(squareroot(num,p));

	}
	static double squareroot(int num, int p) {
		int start=0;
		int end=num;
		double root=0.0;
		while(start<=end) {
			int mid=start+(end-start)/2;
		if(mid*mid==num) {
			root=mid;
			return root;
		}if(mid*mid>num) {
			end=mid-1;
		}else {
			start=mid+1;
		    
		}}
		double incr=0.1;
		for(int i=0;i<p;i++) {
			while(root*root<=num) {
				root+=incr;
				}
			root-=incr;
			incr/=10;
		}
		return root;
		
	}

}
