package binary_search;

import java.util.Arrays;

public class BinarySearch2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{12,13,15,16,17},
				      {22,23,24,25,26},
				      {33,34,35,36,37}};
		int target=12;
		System.out.println(Arrays.toString(search(arr,target)));
		}

	
	static int[] search(int arr[][], int target) {
		int r=0;
		int c=arr.length-1;
		while(r<arr.length&&c>=0) {
			if(target==arr[r][c]) {
				return new int[] {r,c};
			}else if(target<arr[r][c]) {
				c--;
			}else {
				r++;
			}
		}
		return new int[]{-1,-1};
	}

}
