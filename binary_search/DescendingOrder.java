package binary_search;

public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,8,7,6,5,4,3,2,1,0,-1};
		int target=9;
		int ans=bs2(arr, target);
		System.out.println(ans);
		

	}
	static int bs2(int arr[], int target) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target<arr[mid]) {
				start=mid+1;
			}else if(target>arr[mid]) {
				end=mid-1;
			}else {
				return mid;
			}
			
		}
		return -1;
	}

}
