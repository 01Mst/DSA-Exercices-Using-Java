package recursion;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]= {2,3,4,1};
   int row=arr.length-1;
   int col=0;
   bubble(arr,row,col);
   System.out.println(Arrays.toString(arr));
   
	}
	static void bubble(int arr[], int row, int col) {
		 if(row==0) {
			 return;
		 }
		 if(arr[col]>arr[col+1]) {
			 int temp=arr[col];
			 arr[col]=arr[col+1];
			 arr[col+1]=temp;
			 bubble(arr, row-1,0);
		 }
		 else {
			 bubble(arr,row,col+1);
	}

	}}
