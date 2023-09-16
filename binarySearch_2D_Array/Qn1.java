package binarySearch_2D_Array;

import java.util.Arrays;

public class Qn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][]= {{10,20,30,40},
				{15,25,35,45},
				{17,27,37,47},
				{18,28,38,48}};
		int target=100;
		int ans[]=search(matrix, target);
		System.out.println(Arrays.toString(ans));
		
		}
	static int[] search(int matrix[][],int target) {
		int row=0;
		int column=matrix.length-1;
		while(row<matrix.length&&column>=0) {
			if(matrix[row][column]==target) {
				return new int[] {row,column};
			}else if(matrix[row][column]>target){
				column--;}
			else {
				row++;
				}
			
		}
		return new int[] {-1,-1};
		

	}

}
