package binary_search;

import java.util.Arrays;

public class RBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {0,1,2,3,4,5,6,7,8,9};
	//	int target=4;
		int answer=pivot(nums);
		System.out.println(answer);
		
	}
	/*static int findelement(int nums[], int target) {
		int pivotnumber=pivot(nums);
		if(pivotnumber==-1) {
			return binarysearch(nums,target,0,nums.length-1);
		}if(nums[pivotnumber]==target) {
			return pivotnumber;
		}
		if(target>nums[0]) {
			return binarysearch(nums, target,0,pivotnumber-1);
		}
		return binarysearch(nums, target,pivotnumber+1,nums.length-1);
	}
	static int binarysearch(int nums[],int target,int start, int end) {
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(nums[mid]==target) {
				return mid;}
			else if(nums[mid]>target) {
				end=mid-1;
			}else {
				start=mid+1;
			}
			}
		return -1;
			
		
	}*/
	static int pivot(int nums[]) {
		int start=0;
		int end=nums.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(nums[mid]>nums[mid+1]) {
				return mid;
			}if( nums[mid]<nums[mid-1]) {
				return mid-1;
			}if(nums[mid]<=nums[start]) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;
	}}
	/*static int pivotsFromDuplicates(int nums[]) {
		int start=0;
		int end=nums.length-1;
		int mid=start+(end-start)/2;
		while(start<=end) {
			if(nums[mid]>nums[mid+1]) {
				return mid;}
			if(nums[mid]<nums[mid-1]) {
				return mid-1;}
			if(nums[start]==nums[mid]&&nums[end]==nums[start]) {
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
			}

		}
		return -1;
	}

}*/
