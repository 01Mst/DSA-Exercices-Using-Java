package binary_search;

public class Floor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,34,56,78,90,100};
		int target=35;
		int ans=binarysearch(arr, target);
		System.out.println(ans);
	}
	static int binarysearch(int arr[], int target) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target<arr[mid]) {
				end=mid-1;
			}else if(target>arr[mid]) {
				start=mid+1;
			}else {
				return mid;
			}
		}
		return arr[end];

	}

}
