package binary_search;

public class BitonicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,3,4,5,6,7,9,99,2,1};
		int ans=binarysearch(nums);
		System.out.println(ans);

	}
	public static int binarysearch(int nums[]) {
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

}
