package binary_search;

public class BinarySearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,34,56,78,90,100};
		int target=35,target1=57;
		BinarySearch1 bs1=new BinarySearch1();
		int ans=bs1.binarysearch(arr, target);
	    int ans1=bs1.binarysearch(arr, target1);
		System.out.println(ans);
		System.out.println(ans1);
	}
	int binarysearch(int arr[], int target) {
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
		return arr[start];
		
	}

}
