package binarySearch_2D_Array;

import java.util.Arrays;

public class Qn2_Sorted_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][]= {{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}
		};
		int target=14;
		int ans[]=search(matrix,target);
		System.out.println(Arrays.toString(ans));

	}
	static int[] binarySearch(int matrix[][], int row,int cStart,int cEnd, int target) {
		while(cStart<=cEnd) {
		int mid=cStart+(cEnd-cStart)/2;
		if(matrix[row][mid]==target) {
			return new int[] {row,mid};
		}else if(matrix[row][mid]>target) {
			cEnd=mid-1;
		}else {
			 cStart=mid+1;
		}
		}
		return new int[] {-1,-1};
		
	}
	static int[] search(int[][] matrix,int target)
	{
		int rows=matrix.length;
		int cols=matrix[0].length;
		if(rows==1) {
			return binarySearch(matrix,0,0,cols-1,target);
		}
		int rStart=0;
		int rEnd=rows-1; 
		int cMid=cols/2;
		while(rStart<(rEnd-1)) {
			int rmid=rStart+(rEnd-rStart)/2;
			if(matrix[rmid][cMid]==target) {
				return new int[] {rmid, cMid};
			}if(matrix[rmid][cMid]<target) {
				rStart=rmid;}
			else {
				rEnd=rmid;}
			
			
		if(matrix[rStart][cMid]==target) {
			return new int[] {rStart,cMid}; 
			}
		if(matrix[rStart+1][cMid]==target) {
			return new int[] {rStart+1,cMid}; 
	}
	if(target<=matrix[rStart][cMid-1]) {
		binarySearch(matrix,rStart,0,cMid-1,target);
		
		}if(target>=matrix[rStart][cMid+1]&&target<=matrix[rStart][cols-1]) {
			binarySearch(matrix,rStart,cMid+1,cols-1,target);
		
}if(target<=matrix[rStart+1][cMid-1]) {
	binarySearch(matrix,rStart+1,0,cMid-1,target);
}if(target>=matrix[rStart+1][cMid]) {
	binarySearch(matrix,rStart+1,cMid+1,cols-1,target);
	
}}
		return new int[] {-1,-1};

}}