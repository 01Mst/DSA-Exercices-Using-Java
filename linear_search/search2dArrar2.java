package linear_search;

import java.util.Arrays;

public class search2dArrar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3,4},
				{34,56,34,54,654},
				{56,545,3,2}};
		int target=4;
		System.out.println("Element found at index: ");
		search2d(arr, target);
		
		
		}
	static void search2d(int arr[][], int target) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]==target) {
			 System.out.println(row+" "+col);
					
				}
			}
			
		}
		

	}

}
