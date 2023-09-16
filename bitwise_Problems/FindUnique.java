package bitwise_Problems;

public class FindUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,6,2,3,3,1,4,7,7,4};
		System.out.println(ans(arr));

	}

	private static int ans(int[] arr) {
		// TODO Auto-generated method stub
		int unique=0;
		for(int n:arr) {
			unique^=n;
		}
		return unique;
	}

}
