package linear_search;

public class LinearSearchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]= {12,345,2,6,7896};
   int target=3745;
   int ans=ls1(arr, target);
   System.out.println(ans);
   
	}
	static int ls1(int arr[], int target) {
		for(int a:arr) {
			if(target==a) {
				return 1;
				
			}
		}
		return -1;
	}

}
