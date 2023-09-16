package binary_search;

public class RSA_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int nums[]= {4,4,49,3,3,3,3,3,3,3,3,3};
			int answer=pivotsFromDuplicates(nums);
			System.out.println(answer);
			
	}
	static int pivotsFromDuplicates(int nums[]) {
		int start=0;
		int end=nums.length-1;
		int mid=start+(end-start)/2;
		while(start<=end) {
			if(nums[mid]>nums[mid+1]) {
				return mid;}
			if(nums[mid]<nums[mid-1]) {
				return mid-1;}
			if(nums[start]==nums[mid]||nums[end]==nums[mid]) {
				if(nums[start]>nums[start+1]) {
					return start;
				}
				start++;
				if(nums[end]<nums[end-1]) {
					return end-1;
				}
				end--;
				if(nums[start]<nums[mid]||(nums[mid]>nums[end]&&nums[mid]==nums[start])) {
					start=mid+1;
				}else {
					end=mid-1;
				}
			}}


		return -1;
	}

}

