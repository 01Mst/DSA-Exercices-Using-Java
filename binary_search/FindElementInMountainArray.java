package binary_search;

public class FindElementInMountainArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3,4,5,2,1};
		int target=5;
		System.out.println(search(nums, target));

	}
	public static int search(int nums[], int target) {
		int start=0;
		int end=nums.length-1;
		while(start<end) {
			int mid=start+(end-start)/2;
			if(nums[mid]>nums[mid+1]) {
			end=mid;
			}else {
				start=mid+1;
			}
		}
		return end;
	}
	static int orderAgnostics(int arr[], int target) {
		int start=0;
		int end=arr.length-1;
		boolean isAsc=arr[start]<arr[end];
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target==arr[mid]) {
				return mid;
				}
			if(isAsc) {
				if(target<arr[mid]) {
					end=mid-1;
				}else {
					start=mid+1;
				}}
				else {if(target>arr[mid]) {
					end=mid-1;
					}
				else {
					start=mid+1;
				}
			}
		}
		return -1;
	}

}
