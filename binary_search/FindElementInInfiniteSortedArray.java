package binary_search;

public class FindElementInInfiniteSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums= {3,5,7,9,80,98};
		int target=98;
		System.out.println(findrange(nums, target));
	}
	static int findrange(int nums[], int target) {
		int start=0;
		int end=1;
		while(target>nums[end]) {
			int newStart=end+1;
			end=end+(end-start+1)*2;
			start=newStart;
			
		}
		return binarysearch(nums, target, start, end);
		
	}
	static int binarysearch(int nums[], int target, int start, int end) {
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(target<nums[mid]) {
				end=mid-1;
			}else if(target>nums[mid]) {
				start=mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}

}
